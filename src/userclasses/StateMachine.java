/**
 * Your application code goes here
 */
package userclasses;

import com.codename1.capture.Capture;
import com.codename1.components.InfiniteProgress;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.MultipartRequest;
import com.codename1.io.NetworkManager;
import com.codename1.io.Storage;
import com.codename1.processing.Result;
import generated.StateMachineBase;
import com.codename1.ui.*;
import com.codename1.ui.animations.Animation;
import com.codename1.ui.events.*;
import com.codename1.ui.util.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

/**
 *
 * @author Your name here
 */
public class StateMachine extends StateMachineBase {

    private HashMap<String, Object> userData;
    private String path;
    private String videoPath;
    private Dialog currentPuDialog;
    private ComboBox currentPUCombo;
    private final String platform = Display.getInstance().getPlatformName().equalsIgnoreCase("rim") ? "22222" : "44444";

    public StateMachine(String resFile) {
        super(resFile);
        // do not modify, write code in initVars and initialize class members there,
        // the constructor might be invoked too late due to race conditions that might occur
    }

    /**
     * this method should be used to initialize variables instead of the
     * constructor/class scope to avoid race conditions
     */
    protected void initVars(Resources res) {
    }

    @Override
    protected void beforeSplash(Form f) {
        super.beforeSplash(f);
        final String text = "First citizen-driven reporting app in the world for free, fair, credible & peaceful elections!";
        //final String text = "Test!";
        //final String text = "First citizen-driven";
        //final SpanLabel l = findSloganLabel(f);
        final TextArea ta = findSloganTextArea(f);

        Animation anim = new Animation() {
            private long lastTime = System.currentTimeMillis();

            public boolean animate() {
                long t = System.currentTimeMillis();
                int i = ta.getText().length();
                if (t - lastTime >= 150) {
                    if (i == text.length()) {
                        /*userData = (HashMap<String, Object>) Storage.getInstance().readObject("user-data");
                         if (userData == null) {
                         showForm("Register", null);
                         } else {
                         showForm("Main", null);
                         }*/
                        return false;
                    } else {
                        //System.out.println("Animating Label...");
                        if (i == text.length() - 1) {
                            ta.setText(text);
                            //ta.revalidate();
                        } else {
                            ta.setText(text.substring(0, i) + "_");
                            /*if (i % 4 == 0) {
                             l.revalidate();
                             }*/
                        }
                    }
                    //findSplashContainer().revalidate();
                    //i++;
                    /*if(i >= l.getModel().getSize()) {
                     i = 0;
                     }
                     l.setSelectedIndex(i);*/
                    lastTime = t;
                }

                return false;
            }

            public void paint(Graphics g) {

            }
        };

        f.registerAnimated(anim);
    }

    @Override
    protected boolean allowBackTo(String formName) {
        if ("Register".equals(formName)) {
            return false;
        } else if ("SignIn".equals(formName)) {
            return false;
        } else if ("Incidents".equals(formName)) {
            return false;
        } else if ("ElectionResults".equals(formName)) {
            return false;
        } else if ("ElectionMonitoring".equals(formName)) {
            return false;
        } else if ("Splash".equals(formName)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    protected void onRegister_RegisterButtonAction(Component c, ActionEvent event) {
        //System.out.println("In Here ...");
        String name = findFullName().getText();
        String phone = findPhone().getText();
        //final String pu = findPucCode1().getText() + "/" + findPucCode2().getText() + "/" + findPucCode3().getText() + "/" + findPucCode4().getText();
        final String payload = "name=" + name + "&phone=" + phone;//+ "&pu=" + pu;
        if (name.length() == 0 || phone.length() == 0) {// || pu.length() == 0) {
            Dialog.show("Revoda", "Required Fields: \n\n *Name \n *Phone Number", Dialog.TYPE_INFO, null, "Ok", null);
        } else {
//System.out.println("Payload is :: " + payload);
            ConnectionRequest cr
                    = new ConnectionRequest() {

                        @Override
                        protected void buildRequestBody(OutputStream os) throws IOException {
                            os.write(payload.getBytes("UTF-8"));
                        }

                        @Override
                        protected void readResponse(InputStream is) throws IOException {
                            JSONParser p = new JSONParser();
                            Map<String, Object> h = p.parseJSON(new InputStreamReader(is));

                            String message = (String) h.get("message");
                            String status = (String) h.get("status");
                            System.out.println("Status :: " + status + ", Message :: " + message);
                            if (status.equalsIgnoreCase("true")) {
                                HashMap<Object, HashMap<String, Object>> userMap = (HashMap<Object, HashMap<String, Object>>) h.get("user");

                                Vector<String> puList = new Vector<String>();
                                //puList.add(pu);

                                userData = (HashMap<String, Object>) userMap.get("User");
                                userData.put("pu", puList);
                                //System.out.println("Storing ... " + userData.get("name") + " with ID :: " + userData.get("id"));

                                Storage.getInstance().writeObject("user-data", userData);

                                if (Dialog.show("Revoda", message, Dialog.TYPE_INFO, null, "Ok", null)) {
                                    showForm("Main", null);
                                }
                            } else {
                                Dialog.show("Revoda", message, Dialog.TYPE_ERROR, null, "Ok", null);
                            }
                        }
                    };

            InfiniteProgress i = new InfiniteProgress();
            Dialog blocking = i.showInifiniteBlocking();
            blocking.getTitleComponent().setUIID("TransparentTitle");
            cr.setDisposeOnCompletion(blocking);
            cr.setPost(true);
            cr.setUrl("http://apps.revoda.org.ng/api/register_updated");
            NetworkManager.getInstance().shutdown();
            NetworkManager.getInstance().addToQueue(cr);
        }
    }

    @Override
    protected void beforeIncidents(Form f) {
        ComboBox pucCombo = findPucCombo();
        if (userData != null) {
            Vector<String> puList = (Vector<String>) userData.get("pu");

            if (puList.size() == 0) {
                //showForm("AddPUDialog", null);
                Dialog dlg = (Dialog) createContainer(fetchResourceFile(), "AddPUDialog");
                currentPuDialog = dlg;
                currentPUCombo = pucCombo;
                currentPuDialog.show();
            } else {
                for (String pu : puList) {
                    pucCombo.addItem(pu);
                }
            }
        }
    }

    @Override
    protected void beforeMediaOptions(Form f) {
        f.getTitleComponent().setUIID("TransparentTitle");
    }

    @Override
    protected void onMediaOptions_AttachMediaListAction(Component c, ActionEvent event) {
        System.out.println("In Here");
        if (Capture.hasCamera()) {
            List mediaOptionsList = (List) c;
            int selectedIndex = mediaOptionsList.getSelectedIndex();

            if (selectedIndex == 0) {
                Capture.capturePhoto(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        try {
                            path = (String) evt.getSource();
                            System.out.println("path " + path);
                            //is = com.codename1.io.FileSystemStorage.getInstance().openInputStream(path);
                            //Image i = Image.createImage(is);
                            //l.setIcon(i.scaledWidth(300));
                            //f.revalidate();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });
            } else if (selectedIndex == 1) {
                Display.getInstance().openImageGallery(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        try {
                            path = (String) evt.getSource();
                            System.out.println("path " + path);
                            //is = com.codename1.io.FileSystemStorage.getInstance().openInputStream(path);
                            //Image i = Image.createImage(is);
                            //l.setIcon(i.scaledWidth(300));
                            //f.revalidate();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });
            } else if (selectedIndex == 2) {
                Capture.captureVideo(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        try {
                            videoPath = (String) evt.getSource();
                            System.out.println("path " + videoPath);
                            //is = com.codename1.io.FileSystemStorage.getInstance().openInputStream(path);
                            //Image i = Image.createImage(is);
                            //l.setIcon(i.scaledWidth(300));
                            //f.revalidate();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                });
            }
        } else {
            Dialog.show("Revoda", "Oops! Looks like your device has no camera", Dialog.TYPE_INFO, null, "Ok", null);
        }

        Dialog dlg = (Dialog) Display.getInstance().getCurrent();
        dlg.dispose();
    }

    @Override
    protected void onIncidents_SubmitButtonAction(Component c, ActionEvent event) {
//System.out.println("In Here ...");
        final String pu = (String) findPucCombo().getSelectedItem();
        final String userId = (String) userData.get("id");
        final String phone = (String) userData.get("phone");
        final String name = (String) userData.get("name");
        final int incidentTypeId = findIncidentTypeCombo().getSelectedIndex();
        final int electionTypeId = findElectionTypeCombo().getSelectedIndex();
        final String comment = findComments().getText();

        if (pu.length() == 0 || incidentTypeId == 0 || electionTypeId == 0) {
            Dialog.show("Revoda", "Required Fields: \n\n *PU Code \n *Incident Type \n *Election Type", Dialog.TYPE_INFO, null, "Ok", null);
        } else {
            //System.out.println("Payload is :: " + payload);
            if (Dialog.show("Revoda", "Confirm your entries: \n\nElection Type: " + (String) findElectionTypeCombo().getSelectedItem() + "\nIncident Type: " + (String) findIncidentTypeCombo().getSelectedItem() + "\nComment: " + comment, Dialog.TYPE_INFO, null, "Ok", "Cancel")) {
                MultipartRequest mr
                        = new MultipartRequest() {

                            /*@Override
                             protected void buildRequestBody(OutputStream os) throws IOException {
                             //os.write(payload.getBytes("UTF-8"));
                             //mr.addArgument("election_type_id", payload);
                             //mr.addArgument("election_type_id", payload);
                             super.buildRequestBody(os);
                             }*/
                            @Override
                            protected void readResponse(InputStream is) throws IOException {
                                JSONParser p = new JSONParser();
                                Map<String, Object> h = p.parseJSON(new InputStreamReader(is));

                                String message = (String) h.get("message");
                                String status = (String) h.get("status");
                                /*ArrayList<String> dataList = (ArrayList<String>) h.get("post_data");

                                 for (String data : dataList) {
                                 System.out.println(data);
                                 }*/
                                System.out.println("Status :: " + status + ", Message :: " + message);
                                if (status.equalsIgnoreCase("true")) {
                                    Dialog.show("Revoda", message, Dialog.TYPE_INFO, null, "Ok", null);
                                    showForm("Main", null);
                                } else {
                                    Dialog.show("Revoda", message, Dialog.TYPE_ERROR, null, "Ok", null);
                                }
                            }
                        };

                InfiniteProgress i = new InfiniteProgress();
                Dialog blocking = i.showInifiniteBlocking();
                blocking.getTitleComponent().setUIID("TransparentTitle");
                mr.addArgument("user_id", userId);
                mr.addArgument("phone", phone);
                mr.addArgument("name", name);
                mr.addArgument("platform", platform);
                mr.addArgumentNoEncoding("pu", pu);
                mr.addArgument("incident_type_id", incidentTypeId + "");
                mr.addArgument("election_type_id", electionTypeId + "");
                mr.addArgument("comment", comment);
                try {
                    if (path != null && !path.equals("")) {
                        mr.addData("photo_file", path, "image/" + path.substring(path.lastIndexOf(".") + 1));
                    }
                    if (videoPath != null && !videoPath.equals("")) {
                        mr.addData("video_file", videoPath, "video/" + videoPath.substring(videoPath.lastIndexOf(".") + 1));
                    }
                } catch (IOException e) {
                    Dialog.show("Revoda", "Oops! Unable to upload attached image or video", Dialog.TYPE_ERROR, null, "Ok", null);
                }
                mr.setDisposeOnCompletion(blocking);
                mr.setPost(true);
                mr.setUrl("http://apps.revoda.org.ng/api/addIncident");
                NetworkManager.getInstance().shutdown();
                NetworkManager.getInstance().addToQueue(mr);
            }
        }
    }

    @Override
    protected void onSignIn_SignInBtnAction(Component c, ActionEvent event) {
        String phoneNumber = findPhoneNumber().getText();
        String password = findPassword().getText();

        if (phoneNumber.length() == 0 || password.length() == 0) {
            Dialog.show("Revoda", "Required Fields: \n\n *Phone Number \n *Password", Dialog.TYPE_INFO, null, "Ok", null);
        } else {
            showForm("Main", null);
        }
    }

    @Override
    protected void beforeElectionResults(Form f) {
        ComboBox electPucCombo = findElectPucCombo();
        if (userData != null) {
            Vector<String> puList = (Vector<String>) userData.get("pu");

            if (puList.size() == 0) {
                //showForm("AddPUDialog", null);
                Dialog dlg = (Dialog) createContainer(fetchResourceFile(), "AddPUDialog");
                currentPuDialog = dlg;
                currentPUCombo = electPucCombo;
                currentPuDialog.show();
            } else {
                for (String pu : puList) {
                    electPucCombo.addItem(pu);
                }
            }
        }
    }

    @Override
    protected void onElectionResults_ElectSubmitButtonAction(Component c, ActionEvent event) {
        final String pu = (String) findElectPucCombo().getSelectedItem();
        final String userId = (String) userData.get("id");
        final String phone = (String) userData.get("phone");
        final String name = (String) userData.get("name");
        int electionTypeId = findElectTypeCombo().getSelectedIndex();
        /*if (electionTypeId > 3) {
         electionTypeId++;
         }*/
        final String apc = findApc().getText().trim().length() == 0 ? "0" : (findApc().getText().trim());
        final String pdp = findPdp().getText().trim().length() == 0 ? "0" : (findPdp().getText().trim());
        final String lp = findLp().getText().trim().length() == 0 ? "0" : (findLp().getText().trim());
        final String apga = findApga().getText().trim().length() == 0 ? "0" : (findApga().getText().trim());
        final String ncp = findNcp().getText().trim().length() == 0 ? "0" : (findNcp().getText().trim());
        final String adc = findAdc().getText().trim().length() == 0 ? "0" : (findAdc().getText().trim());
        final String pdm = findPdm().getText().trim().length() == 0 ? "0" : (findPdm().getText().trim());
        final String id = findId().getText().trim().length() == 0 ? "0" : (findId().getText().trim());
        final String apa = findApa().getText().trim().length() == 0 ? "0" : (findApa().getText().trim());
        final String pdc = findPdc().getText().trim().length() == 0 ? "0" : (findPdc().getText().trim());
        final String acpn = findAcpn().getText().trim().length() == 0 ? "0" : (findAcpn().getText().trim());
        final String sdp = findSdp().getText().trim().length() == 0 ? "0" : (findSdp().getText().trim());
        final String dpp = findDpp().getText().trim().length() == 0 ? "0" : (findDpp().getText().trim());
        final String cpp = findCpp().getText().trim().length() == 0 ? "0" : (findCpp().getText().trim());
        final String a = findA().getText().trim().length() == 0 ? "0" : (findA().getText().trim());
        final String nnpp = findNnpp().getText().trim().length() == 0 ? "0" : (findNnpp().getText().trim());
        final String udp = findUdp().getText().trim().length() == 0 ? "0" : (findUdp().getText().trim());
        final String kp = findKp().getText().trim().length() == 0 ? "0" : (findKp().getText().trim());
        final String acd = findAcd().getText().trim().length() == 0 ? "0" : (findAcd().getText().trim());
        final String upp = findUpp().getText().trim().length() == 0 ? "0" : (findUpp().getText().trim());
        final String mppp = findMppp().getText().trim().length() == 0 ? "0" : (findMppp().getText().trim());
        final String ppn = findPpn().getText().trim().length() == 0 ? "0" : (findPpn().getText().trim());
        final String upn = findUpn().getText().trim().length() == 0 ? "0" : (findUpn().getText().trim());
        final String ad = findAd().getText().trim().length() == 0 ? "0" : (findAd().getText().trim());
        final String ppa = findPpa().getText().trim().length() == 0 ? "0" : (findPpa().getText().trim());
        final String aa = findAa().getText().trim().length() == 0 ? "0" : (findAa().getText().trim());
        final String comment = findElectComments().getText();
        String partyResults = "";
        if (!lp.equals("0")) {
            partyResults += "LP-" + lp + ",";
        }
        if (!ncp.equals("0")) {
            partyResults += "NCP-" + ncp + ",";
        }
        if (!pdp.equals("0")) {
            partyResults += "PDP-" + pdp + ",";
        }
        if (!adc.equals("0")) {
            partyResults += "ADC-" + adc + ",";
        }
        if (!pdm.equals("0")) {
            partyResults += "PDM-" + pdm + ",";
        }
        if (!id.equals("0")) {
            partyResults += "ID-" + id + ",";
        }
        if (!apa.equals("0")) {
            partyResults += "APA-" + apa + ",";
        }
        if (!apc.equals("0")) {
            partyResults += "APC-" + apc + ",";
        }
        if (!pdc.equals("0")) {
            partyResults += "PDC-" + pdc + ",";
        }
        if (!sdp.equals("0")) {
            partyResults += "SDP-" + sdp + ",";
        }
        if (!dpp.equals("0")) {
            partyResults += "DPP-" + dpp + ",";
        }
        if (!cpp.equals("0")) {
            partyResults += "CPP-" + cpp + ",";
        }
        if (!a.equals("0")) {
            partyResults += "A-" + a + ",";
        }
        if (!nnpp.equals("0")) {
            partyResults += "NNPP-" + nnpp + ",";
        }
        if (!udp.equals("0")) {
            partyResults += "UDP-" + udp + ",";
        }
        if (!kp.equals("0")) {
            partyResults += "KP-" + kp + ",";
        }
        if (!acd.equals("0")) {
            partyResults += "ACD-" + acd + ",";
        }
        if (!upp.equals("0")) {
            partyResults += "UPP-" + upp + ",";
        }
        if (!mppp.equals("0")) {
            partyResults += "MPPP-" + mppp + ",";
        }
        if (!ppn.equals("0")) {
            partyResults += "PPN-" + ppn + ",";
        }
        if (!upn.equals("0")) {
            partyResults += "UPN-" + upn + ",";
        }
        if (!ad.equals("0")) {
            partyResults += "AD-" + ad + ",";
        }
        if (!apga.equals("0")) {
            partyResults += "APGA-" + apga + ",";
        }
        if (!ppa.equals("0")) {
            partyResults += "PPA-" + ppa + ",";
        }
        if (!aa.equals("0")) {
            partyResults += "AA-" + aa + ",";
        }
        if (!acpn.equals("0")) {
            partyResults += "ACPN-" + acpn + ",";
        }

// convert the object to a JSON document
        if (partyResults.length() > 2) {
            partyResults = partyResults.substring(0, partyResults.length() - 1);
        }

        //final String partyResults = "{\"lp\":\"" + lp + "\",\"ncp\":\"" + ncp + "\",\"pdp\":\"" + pdp + "\",\"adc\":\"" + adc + "\",\"pdm\":\"" + pdm + "\",\"id\":\"" + id + "\",\"apa\":\"" + apa + "\",\"apc\":\"" + apc + "\",\"pdc\":\"" + pdc + "\",\"sdp\":\"" + sdp + "\",\"dpp\":\"" + dpp + "\",\"cpp\":\"" + cpp + "\",\"a\":\"" + a + "\",\"nnpp\":\"" + nnpp + "\",\"udp\":\"" + udp + "\",\"kp\":\"" + kp + "\",\"acd\":\"" + acd + "\",\"upp\":\"" + upp + "\",\"mppp\":\"" + mppp + "\",\"ppn\":\"" + ppn + "\",\"upn\":\"" + upn + "\",\"ad\":\"" + ad + "\",\"apga\":\"" + apga + "\",\"ppa\":\"" + ppa + "\",\"aa\":\"" + aa + "\",\"acpn\":\"" + acpn + "\"}";
        Hashtable<String, Object> h = new Hashtable<String, Object>();
        h.put("lp", lp);
        h.put("ncp", ncp);
        h.put("pdp", pdp);
        h.put("adc", adc);
        h.put("pdm", pdm);
        h.put("id", id);
        h.put("apa", apa);
        h.put("apc", apc);
        h.put("pdc", pdc);
        h.put("sdp", sdp);
        h.put("dpp", dpp);
        h.put("cpp", cpp);
        h.put("a", a);
        h.put("nnpp", nnpp);
        h.put("udp", udp);
        h.put("kp", kp);
        h.put("acd", acd);
        h.put("upp", upp);
        h.put("mppp", mppp);
        h.put("ppn", ppn);
        h.put("upn", upn);
        h.put("ad", ad);
        h.put("apga", apga);
        h.put("ppa", ppa);
        h.put("aa", aa);
        h.put("acpn", acpn);

// convert the object to a JSON document
        final String results = Result.fromContent(h).toString();
        final String payload = "user_id=" + userId + "&phone=" + phone + "&name=" + name + "&platform=" + platform + "&election_type_id=" + electionTypeId + "&comment=" + comment + "&pu=" + pu + "&party_results=" + results;

        if (pu.length() == 0 || electionTypeId == 0) {
            Dialog.show("Revoda", "Required Fields: \n\n *PU Code \n *Election Type", Dialog.TYPE_INFO, null, "Ok", null);
        } else {
            if (Dialog.show("Revoda", "Confirm your entries: \n\nElection Type: " + (String) findElectTypeCombo().getSelectedItem() + "\nResult: " + partyResults + "\nComment: " + comment, Dialog.TYPE_INFO, null, "Ok", "Cancel")) {
                ConnectionRequest cr
                        = new ConnectionRequest() {

                            @Override
                            protected void buildRequestBody(OutputStream os) throws IOException {
                                os.write(payload.getBytes("UTF-8"));
                            }

                            @Override
                            protected void readResponse(InputStream is) throws IOException {
                                JSONParser p = new JSONParser();
                                Map<String, Object> h = p.parseJSON(new InputStreamReader(is));

                                String message = (String) h.get("message");
                                String status = (String) h.get("status");
                                System.out.println("Status :: " + status + ", Message :: " + message);
                                if (status.equalsIgnoreCase("true")) {
                                    Dialog.show("Revoda", message, Dialog.TYPE_INFO, null, "Ok", null);
                                    showForm("Main", null);
                                } else {
                                    Dialog.show("Revoda", message, Dialog.TYPE_ERROR, null, "Ok", null);
                                }
                            }
                        };

                InfiniteProgress i = new InfiniteProgress();
                Dialog blocking = i.showInifiniteBlocking();
                blocking.getTitleComponent().setUIID("TransparentTitle");
                cr.setDisposeOnCompletion(blocking);
                cr.setPost(true);
                cr.setUrl("http://apps.revoda.org.ng/api/addResults");
                NetworkManager.getInstance().shutdown();
                NetworkManager.getInstance().addToQueue(cr);
            }
        }
    }

    @Override
    protected void onElectionMonitoring_MonSubmitButtonAction(Component c, ActionEvent event) {
        final String pu = (String) findMonPucCombo().getSelectedItem();
        final String userId = (String) userData.get("id");
        final String phone = (String) userData.get("phone");
        final String name = (String) userData.get("name");
        final int electionTypeId = findMonTypeCombo().getSelectedIndex();
        final int accredStarted = findMonAccreditationCombo().getSelectedIndex();
        final int matAvailable = findMonMaterialsCombo().getSelectedIndex();
        final int voteStarted = findMonVotingCombo().getSelectedIndex();
        final int voteCounted = findMonVoteCountedCombo().getSelectedIndex();
        final int resultAnnounced = findMonResultCombo().getSelectedIndex();
        final int securityAgent = findMonSecurityCombo().getSelectedIndex();
        String security = "none";
        if (securityAgent == 1) {
            security = "helpful";
        } else if (securityAgent == 2) {
            security = "biased";
        }

        final String comment = findMonComments().getText();

        final String payload = "user_id=" + userId + "&phone=" + phone + "&name=" + name + "&platform=" + platform + "&election_type_id=" + electionTypeId + "&comment=" + comment + "&pu=" + pu + "&accreditation_started=" + (accredStarted == 1 ? "yes" : "no") + "&materials_arrive=" + (matAvailable == 1 ? "yes" : "no") + "&voting_started=" + (voteStarted == 1 ? "yes" : "no") + "&voting_counted=" + (voteCounted == 1 ? "yes" : "no") + "&result_announced=" + (resultAnnounced == 1 ? "yes" : "no") + "&security_agent_status=" + security;

        if (pu.length() == 0 || electionTypeId == 0) {
            Dialog.show("Revoda", "Required Fields: \n\n *PU Code \n *Election Type", Dialog.TYPE_INFO, null, "Ok", null);
        } else {
            if (Dialog.show("Revoda", "Confirm your entries: \n\nElection Type: " + (String) findMonTypeCombo().getSelectedItem() + "\nAccreditation Started?: " + (accredStarted == 1 ? "yes" : "no") + "\nMaterials Available?: " + (matAvailable == 1 ? "yes" : "no") + "\nVote Started?: " + (voteStarted == 1 ? "yes" : "no") + "\nVote Counted?: " + (voteCounted == 1 ? "yes" : "no") + "\nResult Announced?: " + (resultAnnounced == 1 ? "yes" : "no") + "\nSecurity Agent?: " + security + "\nComment: " + comment, Dialog.TYPE_INFO, null, "Ok", "Cancel")) {
                ConnectionRequest cr
                        = new ConnectionRequest() {

                            @Override
                            protected void buildRequestBody(OutputStream os) throws IOException {
                                os.write(payload.getBytes("UTF-8"));
                            }

                            @Override
                            protected void readResponse(InputStream is) throws IOException {
                                JSONParser p = new JSONParser();
                                Map<String, Object> h = p.parseJSON(new InputStreamReader(is));

                                String message = (String) h.get("message");
                                String status = (String) h.get("status");
                                System.out.println("Status :: " + status + ", Message :: " + message);
                                if (status.equalsIgnoreCase("true")) {
                                    Dialog.show("Revoda", message, Dialog.TYPE_INFO, null, "Ok", null);
                                    showForm("Main", null);
                                } else {
                                    Dialog.show("Revoda", message, Dialog.TYPE_ERROR, null, "Ok", null);
                                }
                            }
                        };

                InfiniteProgress i = new InfiniteProgress();
                Dialog blocking = i.showInifiniteBlocking();
                blocking.getTitleComponent().setUIID("TransparentTitle");
                cr.setDisposeOnCompletion(blocking);
                cr.setPost(true);
                cr.setUrl("http://apps.revoda.org.ng/api/addMonitor");
                NetworkManager.getInstance().shutdown();
                NetworkManager.getInstance().addToQueue(cr);
            }
        }
    }

    @Override
    protected void beforeElectionMonitoring(Form f) {
        ComboBox pucCombo = findMonPucCombo();
        if (userData != null) {
            Vector<String> puList = (Vector<String>) userData.get("pu");

            if (puList.size() == 0) {
                //showForm("AddPUDialog", null);
                Dialog dlg = (Dialog) createContainer(fetchResourceFile(), "AddPUDialog");
                currentPuDialog = dlg;
                currentPUCombo = pucCombo;
                currentPuDialog.show();
            } else {
                for (String pu : puList) {
                    pucCombo.addItem(pu);
                }
            }
        }
    }

    @Override
    protected void postSplash(Form f) {
        userData = (HashMap<String, Object>) Storage.getInstance().readObject("user-data");
        if (userData != null) {
            System.out.println(" on to the main menu ... ");
            showForm("Main", null);
        }
    }

    @Override
    protected void onAddPUDialog_AddPUButtonAction(Component c, ActionEvent event) {
        final String pu = findPucCode1().getText() + "/" + findPucCode2().getText() + "/" + findPucCode3().getText() + "/" + findPucCode4().getText();
        if (pu.length() == 0) {// || pu.length() == 0) {
            Dialog.show("Revoda", "Required Fields: \n\n *PU Code", Dialog.TYPE_INFO, null, "Ok", null);
        } else {
            if (userData != null) {
                Vector<String> puList = (Vector<String>) userData.get("pu");
                puList.add(pu);
                userData.put("pu", puList);
                Storage.getInstance().writeObject("user-data", userData);

                //or (String tpu : puList) {
                currentPUCombo.addItem(pu);
                //}
            }
            currentPuDialog.dispose();
        }
    }

    @Override
    protected void onElectionMonitoring_AddPUButtonAction(Component c, ActionEvent event) {
        Dialog dlg = (Dialog) createContainer(fetchResourceFile(), "AddPUDialog");
        currentPuDialog = dlg;
        currentPUCombo = findMonPucCombo();
        currentPuDialog.show();
    }

    @Override
    protected void onElectionResults_AddRPUButtonAction(Component c, ActionEvent event) {
        Dialog dlg = (Dialog) createContainer(fetchResourceFile(), "AddPUDialog");
        currentPuDialog = dlg;
        currentPUCombo = findElectPucCombo();
        currentPuDialog.show();

    }

    @Override
    protected void onIncidents_AddIPUButtonAction(Component c, ActionEvent event) {
        Dialog dlg = (Dialog) createContainer(fetchResourceFile(), "AddPUDialog");
        currentPuDialog = dlg;
        currentPUCombo = findPucCombo();
        currentPuDialog.show();
    }

    @Override
    protected void onElectionMonitoring_MonSubmitButtonSmsAction(Component c, ActionEvent event) {
        final String pu = (String) findMonPucCombo().getSelectedItem();
        final String userId = (String) userData.get("id");
        final int electionTypeId = findMonTypeCombo().getSelectedIndex();
        final int accredStarted = findMonAccreditationCombo().getSelectedIndex();
        final int matAvailable = findMonMaterialsCombo().getSelectedIndex();
        final int voteStarted = findMonVotingCombo().getSelectedIndex();
        final int voteCounted = findMonVoteCountedCombo().getSelectedIndex();
        final int resultAnnounced = findMonResultCombo().getSelectedIndex();
        final int securityAgent = findMonSecurityCombo().getSelectedIndex();
        String security = "none";
        if (securityAgent == 1) {
            security = "helpful";
        } else if (securityAgent == 2) {
            security = "biased";
        }

        final String comment = findMonComments().getText();

        //pu electiontype accreditation_started materials_available voting_started voting_counted result_announced security_agent 
        final String payload = "rpt monitor*pu#" + electionTypeId + "#" + (accredStarted == 1 ? "yes" : "no") + "#" + (matAvailable == 1 ? "yes" : "no") + "#" + (voteStarted == 1 ? "yes" : "no") + "#" + (voteCounted == 1 ? "yes" : "no") + "#" + (resultAnnounced == 1 ? "yes" : "no") + "#" + security;

        if (pu.length() == 0 || electionTypeId == 0) {
            Dialog.show("Revoda", "Required Fields: \n\n *PU Code \n *Election Type", Dialog.TYPE_INFO, null, "Ok", null);
        } else {
            if (Dialog.show("Revoda", "Confirm your entries: \n\nElection Type: " + (String) findMonTypeCombo().getSelectedItem() + "\nAccreditation Started?: " + (accredStarted == 1 ? "yes" : "no") + "\nMaterials Available?: " + (matAvailable == 1 ? "yes" : "no") + "\nVote Started?: " + (voteStarted == 1 ? "yes" : "no") + "\nVote Counted?: " + (voteCounted == 1 ? "yes" : "no") + "\nResult Announced?: " + (resultAnnounced == 1 ? "yes" : "no") + "\nSecurity Agent?: " + security + "\nComment: " + comment, Dialog.TYPE_INFO, null, "Ok", "Cancel")) {
                try {
                    Display.getInstance().sendSMS("20050", payload);
                    Dialog.show("Revoda", "Request successfully Sent!", Dialog.TYPE_INFO, null, "Ok", null);
                    showForm("Main", null);
                } catch (IOException ex) {
                    Dialog.show("Revoda", "Could not process your request. Please check you have enough airtime.", Dialog.TYPE_ERROR, null, "Ok", null);
                }
            }
        }
    }

    @Override
    protected void onElectionResults_ElectSubmitButtonSmsAction(Component c, ActionEvent event) {
        final String pu = (String) findElectPucCombo().getSelectedItem();
        final String userId = (String) userData.get("id");
        int electionTypeId = findElectTypeCombo().getSelectedIndex();
        /*if (electionTypeId > 3) {
         electionTypeId++;
         }*/
        final String apc = findApc().getText().trim().length() == 0 ? "0" : (findApc().getText().trim());
        final String pdp = findPdp().getText().trim().length() == 0 ? "0" : (findPdp().getText().trim());
        final String lp = findLp().getText().trim().length() == 0 ? "0" : (findLp().getText().trim());
        final String apga = findApga().getText().trim().length() == 0 ? "0" : (findApga().getText().trim());
        final String ncp = findNcp().getText().trim().length() == 0 ? "0" : (findNcp().getText().trim());
        final String adc = findAdc().getText().trim().length() == 0 ? "0" : (findAdc().getText().trim());
        final String pdm = findPdm().getText().trim().length() == 0 ? "0" : (findPdm().getText().trim());
        final String id = findId().getText().trim().length() == 0 ? "0" : (findId().getText().trim());
        final String apa = findApa().getText().trim().length() == 0 ? "0" : (findApa().getText().trim());
        final String pdc = findPdc().getText().trim().length() == 0 ? "0" : (findPdc().getText().trim());
        final String acpn = findAcpn().getText().trim().length() == 0 ? "0" : (findAcpn().getText().trim());
        final String sdp = findSdp().getText().trim().length() == 0 ? "0" : (findSdp().getText().trim());
        final String dpp = findDpp().getText().trim().length() == 0 ? "0" : (findDpp().getText().trim());
        final String cpp = findCpp().getText().trim().length() == 0 ? "0" : (findCpp().getText().trim());
        final String a = findA().getText().trim().length() == 0 ? "0" : (findA().getText().trim());
        final String nnpp = findNnpp().getText().trim().length() == 0 ? "0" : (findNnpp().getText().trim());
        final String udp = findUdp().getText().trim().length() == 0 ? "0" : (findUdp().getText().trim());
        final String kp = findKp().getText().trim().length() == 0 ? "0" : (findKp().getText().trim());
        final String acd = findAcd().getText().trim().length() == 0 ? "0" : (findAcd().getText().trim());
        final String upp = findUpp().getText().trim().length() == 0 ? "0" : (findUpp().getText().trim());
        final String mppp = findMppp().getText().trim().length() == 0 ? "0" : (findMppp().getText().trim());
        final String ppn = findPpn().getText().trim().length() == 0 ? "0" : (findPpn().getText().trim());
        final String upn = findUpn().getText().trim().length() == 0 ? "0" : (findUpn().getText().trim());
        final String ad = findAd().getText().trim().length() == 0 ? "0" : (findAd().getText().trim());
        final String ppa = findPpa().getText().trim().length() == 0 ? "0" : (findPpa().getText().trim());
        final String aa = findAa().getText().trim().length() == 0 ? "0" : (findAa().getText().trim());
        final String comment = findElectComments().getText();
        //final String partyResults = "{\"lp\":\"" + lp + "\",\"ncp\":\"" + ncp + "\",\"pdp\":\"" + pdp + "\",\"adc\":\"" + adc + "\",\"pdm\":\"" + pdm + "\",\"id\":\"" + id + "\",\"apa\":\"" + apa + "\",\"apc\":\"" + apc + "\",\"pdc\":\"" + pdc + "\",\"sdp\":\"" + sdp + "\",\"dpp\":\"" + dpp + "\",\"cpp\":\"" + cpp + "\",\"a\":\"" + a + "\",\"nnpp\":\"" + nnpp + "\",\"udp\":\"" + udp + "\",\"kp\":\"" + kp + "\",\"acd\":\"" + acd + "\",\"upp\":\"" + upp + "\",\"mppp\":\"" + mppp + "\",\"ppn\":\"" + ppn + "\",\"upn\":\"" + upn + "\",\"ad\":\"" + ad + "\",\"apga\":\"" + apga + "\",\"ppa\":\"" + ppa + "\",\"aa\":\"" + aa + "\",\"acpn\":\"" + acpn + "\"}";
        String partyResults = "";
        if (!lp.equals("0")) {
            partyResults += "LP-" + lp + ",";
        }
        if (!ncp.equals("0")) {
            partyResults += "NCP-" + ncp + ",";
        }
        if (!pdp.equals("0")) {
            partyResults += "PDP-" + pdp + ",";
        }
        if (!adc.equals("0")) {
            partyResults += "ADC-" + adc + ",";
        }
        if (!pdm.equals("0")) {
            partyResults += "PDM-" + pdm + ",";
        }
        if (!id.equals("0")) {
            partyResults += "ID-" + id + ",";
        }
        if (!apa.equals("0")) {
            partyResults += "APA-" + apa + ",";
        }
        if (!apc.equals("0")) {
            partyResults += "APC-" + apc + ",";
        }
        if (!pdc.equals("0")) {
            partyResults += "PDC-" + pdc + ",";
        }
        if (!sdp.equals("0")) {
            partyResults += "SDP-" + sdp + ",";
        }
        if (!dpp.equals("0")) {
            partyResults += "DPP-" + dpp + ",";
        }
        if (!cpp.equals("0")) {
            partyResults += "CPP-" + cpp + ",";
        }
        if (!a.equals("0")) {
            partyResults += "A-" + a + ",";
        }
        if (!nnpp.equals("0")) {
            partyResults += "NNPP-" + nnpp + ",";
        }
        if (!udp.equals("0")) {
            partyResults += "UDP-" + udp + ",";
        }
        if (!kp.equals("0")) {
            partyResults += "KP-" + kp + ",";
        }
        if (!acd.equals("0")) {
            partyResults += "ACD-" + acd + ",";
        }
        if (!upp.equals("0")) {
            partyResults += "UPP-" + upp + ",";
        }
        if (!mppp.equals("0")) {
            partyResults += "MPPP-" + mppp + ",";
        }
        if (!ppn.equals("0")) {
            partyResults += "PPN-" + ppn + ",";
        }
        if (!upn.equals("0")) {
            partyResults += "UPN-" + upn + ",";
        }
        if (!ad.equals("0")) {
            partyResults += "AD-" + ad + ",";
        }
        if (!apga.equals("0")) {
            partyResults += "APGA-" + apga + ",";
        }
        if (!ppa.equals("0")) {
            partyResults += "PPA-" + ppa + ",";
        }
        if (!aa.equals("0")) {
            partyResults += "AA-" + aa + ",";
        }
        if (!acpn.equals("0")) {
            partyResults += "ACPN-" + acpn + ",";
        }

// convert the object to a JSON document
        if (partyResults.length() > 2) {
            partyResults = partyResults.substring(0, partyResults.length() - 1);
        }
        final String payload = "rpt result*pu#" + electionTypeId + "#" + partyResults + "#" + comment;

        if (pu.length() == 0 || electionTypeId == 0) {
            Dialog.show("Revoda", "Required Fields: \n\n *PU Code \n *Election Type", Dialog.TYPE_INFO, null, "Ok", null);
        } else {
            if (Dialog.show("Revoda", "Confirm your entries: \n\nElection Type: " + (String) findElectTypeCombo().getSelectedItem() + "\nResult: " + partyResults + "\nComment: " + comment, Dialog.TYPE_INFO, null, "Ok", "Cancel")) {
                try {
                    Display.getInstance().sendSMS("20050", payload);
                    Dialog.show("Revoda", "Request successfully Sent!", Dialog.TYPE_INFO, null, "Ok", null);
                    showForm("Main", null);
                } catch (IOException ex) {
                    Dialog.show("Revoda", "Could not process your request. Please check you have enough airtime.", Dialog.TYPE_ERROR, null, "Ok", null);
                }
            }
        }

    }

    @Override
    protected void onIncidents_SubmitButtonSmsAction(Component c, ActionEvent event) {
        final String pu = (String) findPucCombo().getSelectedItem();
        final String userId = (String) userData.get("id");
        final int incidentTypeId = findIncidentTypeCombo().getSelectedIndex();
        final int electionTypeId = findElectionTypeCombo().getSelectedIndex();
        final String comment = findComments().getText();

        String payload = "rpt incident*pu#" + electionTypeId + "#" + incidentTypeId + "#" + comment;

        if (pu.length() == 0 || incidentTypeId == 0 || electionTypeId == 0) {
            Dialog.show("Revoda", "Required Fields: \n\n *PU Code \n *Incident Type \n *Election Type", Dialog.TYPE_INFO, null, "Ok", null);
        } else {
            if (Dialog.show("Revoda", "Confirm your entries: \n\nElection Type: " + (String) findElectionTypeCombo().getSelectedItem() + "\nIncident Type: " + (String) findIncidentTypeCombo().getSelectedItem() + "\nComment: " + comment, Dialog.TYPE_INFO, null, "Ok", "Cancel")) {
                try {
                    Display.getInstance().sendSMS("20050", payload);
                    Dialog.show("Revoda", "Request successfully Sent!", Dialog.TYPE_INFO, null, "Ok", null);
                    showForm("Main", null);
                } catch (IOException ex) {
                    Dialog.show("Revoda", "Could not process your request. Please check you have enough airtime.", Dialog.TYPE_ERROR, null, "Ok", null);
                }
            }
        }
    }
}
