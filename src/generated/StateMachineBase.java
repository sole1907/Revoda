/**
 * This class contains generated code from the Codename One Designer, DO NOT MODIFY!
 * This class is designed for subclassing that way the code generator can overwrite it
 * anytime without erasing your changes which should exist in a subclass!
 * For details about this file and how it works please read this blog post:
 * http://codenameone.blogspot.com/2010/10/ui-builder-class-how-to-actually-use.html
*/
package generated;

import com.codename1.ui.*;
import com.codename1.ui.util.*;
import com.codename1.ui.plaf.*;
import java.util.Hashtable;
import com.codename1.ui.events.*;

public abstract class StateMachineBase extends UIBuilder {
    private Container aboutToShowThisContainer;
    /**
     * this method should be used to initialize variables instead of
     * the constructor/class scope to avoid race conditions
     */
    /**
    * @deprecated use the version that accepts a resource as an argument instead
    
**/
    protected void initVars() {}

    protected void initVars(Resources res) {}

    public StateMachineBase(Resources res, String resPath, boolean loadTheme) {
        startApp(res, resPath, loadTheme);
    }

    public Container startApp(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("List", com.codename1.ui.List.class);
        UIBuilder.registerCustomComponent("MultiButton", com.codename1.components.MultiButton.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    if(resPath.endsWith(".res")) {
                        res = Resources.open(resPath);
                        System.out.println("Warning: you should construct the state machine without the .res extension to allow theme overlays");
                    } else {
                        res = Resources.openLayered(resPath);
                    }
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        if(res != null) {
            setResourceFilePath(resPath);
            setResourceFile(res);
            initVars(res);
            return showForm(getFirstFormName(), null);
        } else {
            Form f = (Form)createContainer(resPath, getFirstFormName());
            initVars(fetchResourceFile());
            beforeShow(f);
            f.show();
            postShow(f);
            return f;
        }
    }

    protected String getFirstFormName() {
        return "Splash";
    }

    public Container createWidget(Resources res, String resPath, boolean loadTheme) {
        initVars();
        UIBuilder.registerCustomComponent("Container", com.codename1.ui.Container.class);
        UIBuilder.registerCustomComponent("Form", com.codename1.ui.Form.class);
        UIBuilder.registerCustomComponent("Button", com.codename1.ui.Button.class);
        UIBuilder.registerCustomComponent("TextArea", com.codename1.ui.TextArea.class);
        UIBuilder.registerCustomComponent("ComboBox", com.codename1.ui.ComboBox.class);
        UIBuilder.registerCustomComponent("Dialog", com.codename1.ui.Dialog.class);
        UIBuilder.registerCustomComponent("Label", com.codename1.ui.Label.class);
        UIBuilder.registerCustomComponent("TextField", com.codename1.ui.TextField.class);
        UIBuilder.registerCustomComponent("List", com.codename1.ui.List.class);
        UIBuilder.registerCustomComponent("MultiButton", com.codename1.components.MultiButton.class);
        if(loadTheme) {
            if(res == null) {
                try {
                    res = Resources.openLayered(resPath);
                } catch(java.io.IOException err) { err.printStackTrace(); }
            }
            initTheme(res);
        }
        return createContainer(resPath, "Splash");
    }

    protected void initTheme(Resources res) {
            String[] themes = res.getThemeResourceNames();
            if(themes != null && themes.length > 0) {
                UIManager.getInstance().setThemeProps(res.getTheme(themes[0]));
            }
    }

    public StateMachineBase() {
    }

    public StateMachineBase(String resPath) {
        this(null, resPath, true);
    }

    public StateMachineBase(Resources res) {
        this(res, null, true);
    }

    public StateMachineBase(String resPath, boolean loadTheme) {
        this(null, resPath, loadTheme);
    }

    public StateMachineBase(Resources res, boolean loadTheme) {
        this(res, null, loadTheme);
    }

    public com.codename1.components.MultiButton findMultiButton3(Component root) {
        return (com.codename1.components.MultiButton)findByName("MultiButton3", root);
    }

    public com.codename1.components.MultiButton findMultiButton3() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("MultiButton3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("MultiButton3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea1(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea1", root);
    }

    public com.codename1.ui.TextArea findTextArea1() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea4(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea4", root);
    }

    public com.codename1.ui.TextArea findTextArea4() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea5(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea5", root);
    }

    public com.codename1.ui.TextArea findTextArea5() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea2(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea2", root);
    }

    public com.codename1.ui.TextArea findTextArea2() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea3(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea3", root);
    }

    public com.codename1.ui.TextArea findTextArea3() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea8(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea8", root);
    }

    public com.codename1.ui.TextArea findTextArea8() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea8", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea8", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea9(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea9", root);
    }

    public com.codename1.ui.TextArea findTextArea9() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea9", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea9", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findElectSubmitButton(Component root) {
        return (com.codename1.ui.Button)findByName("electSubmitButton", root);
    }

    public com.codename1.ui.Button findElectSubmitButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("electSubmitButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("electSubmitButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea6(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea6", root);
    }

    public com.codename1.ui.TextArea findTextArea6() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea6", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea6", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findMultiButton2(Component root) {
        return (com.codename1.components.MultiButton)findByName("MultiButton2", root);
    }

    public com.codename1.components.MultiButton findMultiButton2() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("MultiButton2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("MultiButton2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea7(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea7", root);
    }

    public com.codename1.ui.TextArea findTextArea7() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea7", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea7", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findMultiButton1(Component root) {
        return (com.codename1.components.MultiButton)findByName("MultiButton1", root);
    }

    public com.codename1.components.MultiButton findMultiButton1() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("MultiButton1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("MultiButton1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findAddPUButton(Component root) {
        return (com.codename1.ui.Button)findByName("addPUButton", root);
    }

    public com.codename1.ui.Button findAddPUButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("addPUButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("addPUButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPassword(Component root) {
        return (com.codename1.ui.TextField)findByName("password", root);
    }

    public com.codename1.ui.TextField findPassword() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("password", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("password", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findApa(Component root) {
        return (com.codename1.ui.TextField)findByName("apa", root);
    }

    public com.codename1.ui.TextField findApa() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("apa", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("apa", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findIncidentTypeCombo(Component root) {
        return (com.codename1.ui.ComboBox)findByName("incidentTypeCombo", root);
    }

    public com.codename1.ui.ComboBox findIncidentTypeCombo() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("incidentTypeCombo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("incidentTypeCombo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findApc(Component root) {
        return (com.codename1.ui.TextField)findByName("apc", root);
    }

    public com.codename1.ui.TextField findApc() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("apc", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("apc", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton(Component root) {
        return (com.codename1.ui.Button)findByName("Button", root);
    }

    public com.codename1.ui.Button findButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findMonSubmitButtonSms(Component root) {
        return (com.codename1.ui.Button)findByName("monSubmitButtonSms", root);
    }

    public com.codename1.ui.Button findMonSubmitButtonSms() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("monSubmitButtonSms", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("monSubmitButtonSms", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPucCode1(Component root) {
        return (com.codename1.ui.TextField)findByName("pucCode1", root);
    }

    public com.codename1.ui.TextField findPucCode1() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("pucCode1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("pucCode1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPucCode2(Component root) {
        return (com.codename1.ui.TextField)findByName("pucCode2", root);
    }

    public com.codename1.ui.TextField findPucCode2() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("pucCode2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("pucCode2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPucCode3(Component root) {
        return (com.codename1.ui.TextField)findByName("pucCode3", root);
    }

    public com.codename1.ui.TextField findPucCode3() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("pucCode3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("pucCode3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea28(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea28", root);
    }

    public com.codename1.ui.TextArea findTextArea28() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea28", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea28", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPucCode4(Component root) {
        return (com.codename1.ui.TextField)findByName("pucCode4", root);
    }

    public com.codename1.ui.TextField findPucCode4() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("pucCode4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("pucCode4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findId(Component root) {
        return (com.codename1.ui.TextField)findByName("id", root);
    }

    public com.codename1.ui.TextField findId() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("id", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("id", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAa(Component root) {
        return (com.codename1.ui.TextField)findByName("aa", root);
    }

    public com.codename1.ui.TextField findAa() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("aa", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("aa", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAd(Component root) {
        return (com.codename1.ui.TextField)findByName("ad", root);
    }

    public com.codename1.ui.TextField findAd() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ad", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ad", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findMonSecurityCombo(Component root) {
        return (com.codename1.ui.ComboBox)findByName("monSecurityCombo", root);
    }

    public com.codename1.ui.ComboBox findMonSecurityCombo() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("monSecurityCombo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("monSecurityCombo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findAddRPUButton(Component root) {
        return (com.codename1.ui.Button)findByName("addRPUButton", root);
    }

    public com.codename1.ui.Button findAddRPUButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("addRPUButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("addRPUButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findUpn(Component root) {
        return (com.codename1.ui.TextField)findByName("upn", root);
    }

    public com.codename1.ui.TextField findUpn() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("upn", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("upn", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findUpp(Component root) {
        return (com.codename1.ui.TextField)findByName("upp", root);
    }

    public com.codename1.ui.TextField findUpp() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("upp", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("upp", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPhone(Component root) {
        return (com.codename1.ui.TextField)findByName("phone", root);
    }

    public com.codename1.ui.TextField findPhone() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("phone", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("phone", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findSdp(Component root) {
        return (com.codename1.ui.TextField)findByName("sdp", root);
    }

    public com.codename1.ui.TextField findSdp() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("sdp", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("sdp", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea10(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea10", root);
    }

    public com.codename1.ui.TextArea findTextArea10() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea10", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea10", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea12(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea12", root);
    }

    public com.codename1.ui.TextArea findTextArea12() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea12", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea12", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea11(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea11", root);
    }

    public com.codename1.ui.TextArea findTextArea11() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea11", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea11", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea14(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea14", root);
    }

    public com.codename1.ui.TextArea findTextArea14() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea14", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea14", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea13(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea13", root);
    }

    public com.codename1.ui.TextArea findTextArea13() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea13", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea13", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea16(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea16", root);
    }

    public com.codename1.ui.TextArea findTextArea16() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea16", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea16", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.List findAttachMediaList(Component root) {
        return (com.codename1.ui.List)findByName("attachMediaList", root);
    }

    public com.codename1.ui.List findAttachMediaList() {
        com.codename1.ui.List cmp = (com.codename1.ui.List)findByName("attachMediaList", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.List)findByName("attachMediaList", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea15(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea15", root);
    }

    public com.codename1.ui.TextArea findTextArea15() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea15", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea15", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findMonVoteCountedCombo(Component root) {
        return (com.codename1.ui.ComboBox)findByName("monVoteCountedCombo", root);
    }

    public com.codename1.ui.ComboBox findMonVoteCountedCombo() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("monVoteCountedCombo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("monVoteCountedCombo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findMonPucCombo(Component root) {
        return (com.codename1.ui.ComboBox)findByName("monPucCombo", root);
    }

    public com.codename1.ui.ComboBox findMonPucCombo() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("monPucCombo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("monPucCombo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findNcp(Component root) {
        return (com.codename1.ui.TextField)findByName("ncp", root);
    }

    public com.codename1.ui.TextField findNcp() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ncp", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ncp", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.components.MultiButton findMultiButton(Component root) {
        return (com.codename1.components.MultiButton)findByName("MultiButton", root);
    }

    public com.codename1.components.MultiButton findMultiButton() {
        com.codename1.components.MultiButton cmp = (com.codename1.components.MultiButton)findByName("MultiButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.components.MultiButton)findByName("MultiButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPpa(Component root) {
        return (com.codename1.ui.TextField)findByName("ppa", root);
    }

    public com.codename1.ui.TextField findPpa() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ppa", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ppa", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea21(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea21", root);
    }

    public com.codename1.ui.TextArea findTextArea21() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea21", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea21", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel22(Component root) {
        return (com.codename1.ui.Label)findByName("Label22", root);
    }

    public com.codename1.ui.Label findLabel22() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label22", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label22", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findA(Component root) {
        return (com.codename1.ui.TextField)findByName("a", root);
    }

    public com.codename1.ui.TextField findA() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("a", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("a", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea20(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea20", root);
    }

    public com.codename1.ui.TextArea findTextArea20() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea20", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea20", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel23(Component root) {
        return (com.codename1.ui.Label)findByName("Label23", root);
    }

    public com.codename1.ui.Label findLabel23() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label23", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label23", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea23(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea23", root);
    }

    public com.codename1.ui.TextArea findTextArea23() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea23", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea23", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel24(Component root) {
        return (com.codename1.ui.Label)findByName("Label24", root);
    }

    public com.codename1.ui.Label findLabel24() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label24", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label24", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea22(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea22", root);
    }

    public com.codename1.ui.TextArea findTextArea22() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea22", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea22", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel25(Component root) {
        return (com.codename1.ui.Label)findByName("Label25", root);
    }

    public com.codename1.ui.Label findLabel25() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label25", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label25", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findApga(Component root) {
        return (com.codename1.ui.TextField)findByName("apga", root);
    }

    public com.codename1.ui.TextField findApga() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("apga", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("apga", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea25(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea25", root);
    }

    public com.codename1.ui.TextArea findTextArea25() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea25", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea25", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findDpp(Component root) {
        return (com.codename1.ui.TextField)findByName("dpp", root);
    }

    public com.codename1.ui.TextField findDpp() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("dpp", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("dpp", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findKp(Component root) {
        return (com.codename1.ui.TextField)findByName("kp", root);
    }

    public com.codename1.ui.TextField findKp() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("kp", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("kp", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea24(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea24", root);
    }

    public com.codename1.ui.TextArea findTextArea24() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea24", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea24", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel20(Component root) {
        return (com.codename1.ui.Label)findByName("Label20", root);
    }

    public com.codename1.ui.Label findLabel20() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label20", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label20", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea27(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea27", root);
    }

    public com.codename1.ui.TextArea findTextArea27() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea27", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea27", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel21(Component root) {
        return (com.codename1.ui.Label)findByName("Label21", root);
    }

    public com.codename1.ui.Label findLabel21() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label21", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label21", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea26(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea26", root);
    }

    public com.codename1.ui.TextArea findTextArea26() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea26", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea26", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel26(Component root) {
        return (com.codename1.ui.Label)findByName("Label26", root);
    }

    public com.codename1.ui.Label findLabel26() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label26", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label26", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findElectPucCombo(Component root) {
        return (com.codename1.ui.ComboBox)findByName("electPucCombo", root);
    }

    public com.codename1.ui.ComboBox findElectPucCombo() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("electPucCombo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("electPucCombo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel27(Component root) {
        return (com.codename1.ui.Label)findByName("Label27", root);
    }

    public com.codename1.ui.Label findLabel27() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label27", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label27", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel28(Component root) {
        return (com.codename1.ui.Label)findByName("Label28", root);
    }

    public com.codename1.ui.Label findLabel28() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label28", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label28", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPpn(Component root) {
        return (com.codename1.ui.TextField)findByName("ppn", root);
    }

    public com.codename1.ui.TextField findPpn() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("ppn", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("ppn", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findSloganTextArea(Component root) {
        return (com.codename1.ui.TextArea)findByName("sloganTextArea", root);
    }

    public com.codename1.ui.TextArea findSloganTextArea() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("sloganTextArea", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("sloganTextArea", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea18(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea18", root);
    }

    public com.codename1.ui.TextArea findTextArea18() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea18", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea18", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea17(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea17", root);
    }

    public com.codename1.ui.TextArea findTextArea17() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea17", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea17", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea19(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea19", root);
    }

    public com.codename1.ui.TextArea findTextArea19() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea19", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea19", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findSubmitButtonSms(Component root) {
        return (com.codename1.ui.Button)findByName("submitButtonSms", root);
    }

    public com.codename1.ui.Button findSubmitButtonSms() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("submitButtonSms", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("submitButtonSms", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel11(Component root) {
        return (com.codename1.ui.Label)findByName("Label11", root);
    }

    public com.codename1.ui.Label findLabel11() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label11", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label11", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea114(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea114", root);
    }

    public com.codename1.ui.TextArea findTextArea114() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea114", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea114", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton41(Component root) {
        return (com.codename1.ui.Button)findByName("Button41", root);
    }

    public com.codename1.ui.Button findButton41() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button41", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button41", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel12(Component root) {
        return (com.codename1.ui.Label)findByName("Label12", root);
    }

    public com.codename1.ui.Label findLabel12() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label12", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label12", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea115(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea115", root);
    }

    public com.codename1.ui.TextArea findTextArea115() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea115", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea115", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer9(Component root) {
        return (com.codename1.ui.Container)findByName("Container9", root);
    }

    public com.codename1.ui.Container findContainer9() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container9", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container9", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea112(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea112", root);
    }

    public com.codename1.ui.TextArea findTextArea112() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea112", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea112", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel13(Component root) {
        return (com.codename1.ui.Label)findByName("Label13", root);
    }

    public com.codename1.ui.Label findLabel13() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label13", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label13", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAcd(Component root) {
        return (com.codename1.ui.TextField)findByName("acd", root);
    }

    public com.codename1.ui.TextField findAcd() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("acd", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("acd", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel14(Component root) {
        return (com.codename1.ui.Label)findByName("Label14", root);
    }

    public com.codename1.ui.Label findLabel14() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label14", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label14", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea113(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea113", root);
    }

    public com.codename1.ui.TextArea findTextArea113() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea113", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea113", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findLp(Component root) {
        return (com.codename1.ui.TextField)findByName("lp", root);
    }

    public com.codename1.ui.TextField findLp() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("lp", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("lp", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton1(Component root) {
        return (com.codename1.ui.Button)findByName("Button1", root);
    }

    public com.codename1.ui.Button findButton1() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea", root);
    }

    public com.codename1.ui.TextArea findTextArea() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea116(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea116", root);
    }

    public com.codename1.ui.TextArea findTextArea116() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea116", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea116", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel10(Component root) {
        return (com.codename1.ui.Label)findByName("Label10", root);
    }

    public com.codename1.ui.Label findLabel10() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label10", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label10", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea117(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea117", root);
    }

    public com.codename1.ui.TextArea findTextArea117() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea117", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea117", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findMonAccreditationCombo(Component root) {
        return (com.codename1.ui.ComboBox)findByName("monAccreditationCombo", root);
    }

    public com.codename1.ui.ComboBox findMonAccreditationCombo() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("monAccreditationCombo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("monAccreditationCombo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer3(Component root) {
        return (com.codename1.ui.Container)findByName("Container3", root);
    }

    public com.codename1.ui.Container findContainer3() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel(Component root) {
        return (com.codename1.ui.Label)findByName("Label", root);
    }

    public com.codename1.ui.Label findLabel() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel19(Component root) {
        return (com.codename1.ui.Label)findByName("Label19", root);
    }

    public com.codename1.ui.Label findLabel19() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label19", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label19", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer4(Component root) {
        return (com.codename1.ui.Container)findByName("Container4", root);
    }

    public com.codename1.ui.Container findContainer4() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer1(Component root) {
        return (com.codename1.ui.Container)findByName("Container1", root);
    }

    public com.codename1.ui.Container findContainer1() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer2(Component root) {
        return (com.codename1.ui.Container)findByName("Container2", root);
    }

    public com.codename1.ui.Container findContainer2() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel15(Component root) {
        return (com.codename1.ui.Label)findByName("Label15", root);
    }

    public com.codename1.ui.Label findLabel15() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label15", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label15", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea110(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea110", root);
    }

    public com.codename1.ui.TextArea findTextArea110() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea110", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea110", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAcpn(Component root) {
        return (com.codename1.ui.TextField)findByName("acpn", root);
    }

    public com.codename1.ui.TextField findAcpn() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("acpn", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("acpn", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel16(Component root) {
        return (com.codename1.ui.Label)findByName("Label16", root);
    }

    public com.codename1.ui.Label findLabel16() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label16", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label16", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findTextArea111(Component root) {
        return (com.codename1.ui.TextArea)findByName("TextArea111", root);
    }

    public com.codename1.ui.TextArea findTextArea111() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("TextArea111", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("TextArea111", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel17(Component root) {
        return (com.codename1.ui.Label)findByName("Label17", root);
    }

    public com.codename1.ui.Label findLabel17() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label17", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label17", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer5(Component root) {
        return (com.codename1.ui.Container)findByName("Container5", root);
    }

    public com.codename1.ui.Container findContainer5() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel18(Component root) {
        return (com.codename1.ui.Label)findByName("Label18", root);
    }

    public com.codename1.ui.Label findLabel18() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label18", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label18", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Container findContainer(Component root) {
        return (com.codename1.ui.Container)findByName("Container", root);
    }

    public com.codename1.ui.Container findContainer() {
        com.codename1.ui.Container cmp = (com.codename1.ui.Container)findByName("Container", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Container)findByName("Container", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findElectSubmitButtonSms(Component root) {
        return (com.codename1.ui.Button)findByName("electSubmitButtonSms", root);
    }

    public com.codename1.ui.Button findElectSubmitButtonSms() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("electSubmitButtonSms", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("electSubmitButtonSms", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findElectComments(Component root) {
        return (com.codename1.ui.TextArea)findByName("electComments", root);
    }

    public com.codename1.ui.TextArea findElectComments() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("electComments", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("electComments", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findSignInBtn(Component root) {
        return (com.codename1.ui.Button)findByName("signInBtn", root);
    }

    public com.codename1.ui.Button findSignInBtn() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("signInBtn", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("signInBtn", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton43(Component root) {
        return (com.codename1.ui.Button)findByName("Button43", root);
    }

    public com.codename1.ui.Button findButton43() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button43", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button43", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton42(Component root) {
        return (com.codename1.ui.Button)findByName("Button42", root);
    }

    public com.codename1.ui.Button findButton42() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button42", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button42", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findPucCombo(Component root) {
        return (com.codename1.ui.ComboBox)findByName("pucCombo", root);
    }

    public com.codename1.ui.ComboBox findPucCombo() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("pucCombo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("pucCombo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findAdc(Component root) {
        return (com.codename1.ui.TextField)findByName("adc", root);
    }

    public com.codename1.ui.TextField findAdc() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("adc", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("adc", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findMonSubmitButton(Component root) {
        return (com.codename1.ui.Button)findByName("monSubmitButton", root);
    }

    public com.codename1.ui.Button findMonSubmitButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("monSubmitButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("monSubmitButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findCpp(Component root) {
        return (com.codename1.ui.TextField)findByName("cpp", root);
    }

    public com.codename1.ui.TextField findCpp() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("cpp", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("cpp", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findMonMaterialsCombo(Component root) {
        return (com.codename1.ui.ComboBox)findByName("monMaterialsCombo", root);
    }

    public com.codename1.ui.ComboBox findMonMaterialsCombo() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("monMaterialsCombo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("monMaterialsCombo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findMonResultCombo(Component root) {
        return (com.codename1.ui.ComboBox)findByName("monResultCombo", root);
    }

    public com.codename1.ui.ComboBox findMonResultCombo() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("monResultCombo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("monResultCombo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel111(Component root) {
        return (com.codename1.ui.Label)findByName("Label111", root);
    }

    public com.codename1.ui.Label findLabel111() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label111", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label111", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel110(Component root) {
        return (com.codename1.ui.Label)findByName("Label110", root);
    }

    public com.codename1.ui.Label findLabel110() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label110", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label110", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel113(Component root) {
        return (com.codename1.ui.Label)findByName("Label113", root);
    }

    public com.codename1.ui.Label findLabel113() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label113", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label113", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findAttachMediaButton(Component root) {
        return (com.codename1.ui.Button)findByName("attachMediaButton", root);
    }

    public com.codename1.ui.Button findAttachMediaButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("attachMediaButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("attachMediaButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel112(Component root) {
        return (com.codename1.ui.Label)findByName("Label112", root);
    }

    public com.codename1.ui.Label findLabel112() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label112", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label112", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findAddIPUButton(Component root) {
        return (com.codename1.ui.Button)findByName("addIPUButton", root);
    }

    public com.codename1.ui.Button findAddIPUButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("addIPUButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("addIPUButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findMonComments(Component root) {
        return (com.codename1.ui.TextArea)findByName("monComments", root);
    }

    public com.codename1.ui.TextArea findMonComments() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("monComments", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("monComments", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPhoneNumber(Component root) {
        return (com.codename1.ui.TextField)findByName("phoneNumber", root);
    }

    public com.codename1.ui.TextField findPhoneNumber() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("phoneNumber", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("phoneNumber", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findButton4(Component root) {
        return (com.codename1.ui.Button)findByName("Button4", root);
    }

    public com.codename1.ui.Button findButton4() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("Button4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("Button4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findUdp(Component root) {
        return (com.codename1.ui.TextField)findByName("udp", root);
    }

    public com.codename1.ui.TextField findUdp() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("udp", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("udp", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findMonVotingCombo(Component root) {
        return (com.codename1.ui.ComboBox)findByName("monVotingCombo", root);
    }

    public com.codename1.ui.ComboBox findMonVotingCombo() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("monVotingCombo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("monVotingCombo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findMppp(Component root) {
        return (com.codename1.ui.TextField)findByName("mppp", root);
    }

    public com.codename1.ui.TextField findMppp() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("mppp", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("mppp", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel9(Component root) {
        return (com.codename1.ui.Label)findByName("Label9", root);
    }

    public com.codename1.ui.Label findLabel9() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label9", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label9", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel115(Component root) {
        return (com.codename1.ui.Label)findByName("Label115", root);
    }

    public com.codename1.ui.Label findLabel115() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label115", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label115", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel8(Component root) {
        return (com.codename1.ui.Label)findByName("Label8", root);
    }

    public com.codename1.ui.Label findLabel8() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label8", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label8", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel114(Component root) {
        return (com.codename1.ui.Label)findByName("Label114", root);
    }

    public com.codename1.ui.Label findLabel114() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label114", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label114", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel117(Component root) {
        return (com.codename1.ui.Label)findByName("Label117", root);
    }

    public com.codename1.ui.Label findLabel117() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label117", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label117", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel116(Component root) {
        return (com.codename1.ui.Label)findByName("Label116", root);
    }

    public com.codename1.ui.Label findLabel116() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label116", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label116", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel5(Component root) {
        return (com.codename1.ui.Label)findByName("Label5", root);
    }

    public com.codename1.ui.Label findLabel5() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label5", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label5", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findElectTypeCombo(Component root) {
        return (com.codename1.ui.ComboBox)findByName("electTypeCombo", root);
    }

    public com.codename1.ui.ComboBox findElectTypeCombo() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("electTypeCombo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("electTypeCombo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel4(Component root) {
        return (com.codename1.ui.Label)findByName("Label4", root);
    }

    public com.codename1.ui.Label findLabel4() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label4", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label4", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel118(Component root) {
        return (com.codename1.ui.Label)findByName("Label118", root);
    }

    public com.codename1.ui.Label findLabel118() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label118", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label118", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findRegisterButton(Component root) {
        return (com.codename1.ui.Button)findByName("registerButton", root);
    }

    public com.codename1.ui.Button findRegisterButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("registerButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("registerButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel7(Component root) {
        return (com.codename1.ui.Label)findByName("Label7", root);
    }

    public com.codename1.ui.Label findLabel7() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label7", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label7", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel6(Component root) {
        return (com.codename1.ui.Label)findByName("Label6", root);
    }

    public com.codename1.ui.Label findLabel6() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label6", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label6", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Button findSubmitButton(Component root) {
        return (com.codename1.ui.Button)findByName("submitButton", root);
    }

    public com.codename1.ui.Button findSubmitButton() {
        com.codename1.ui.Button cmp = (com.codename1.ui.Button)findByName("submitButton", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Button)findByName("submitButton", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextArea findComments(Component root) {
        return (com.codename1.ui.TextArea)findByName("comments", root);
    }

    public com.codename1.ui.TextArea findComments() {
        com.codename1.ui.TextArea cmp = (com.codename1.ui.TextArea)findByName("comments", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextArea)findByName("comments", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel1(Component root) {
        return (com.codename1.ui.Label)findByName("Label1", root);
    }

    public com.codename1.ui.Label findLabel1() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label1", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label1", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findElectionTypeCombo(Component root) {
        return (com.codename1.ui.ComboBox)findByName("electionTypeCombo", root);
    }

    public com.codename1.ui.ComboBox findElectionTypeCombo() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("electionTypeCombo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("electionTypeCombo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findFullName(Component root) {
        return (com.codename1.ui.TextField)findByName("fullName", root);
    }

    public com.codename1.ui.TextField findFullName() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("fullName", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("fullName", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel3(Component root) {
        return (com.codename1.ui.Label)findByName("Label3", root);
    }

    public com.codename1.ui.Label findLabel3() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label3", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label3", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.Label findLabel2(Component root) {
        return (com.codename1.ui.Label)findByName("Label2", root);
    }

    public com.codename1.ui.Label findLabel2() {
        com.codename1.ui.Label cmp = (com.codename1.ui.Label)findByName("Label2", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.Label)findByName("Label2", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPdc(Component root) {
        return (com.codename1.ui.TextField)findByName("pdc", root);
    }

    public com.codename1.ui.TextField findPdc() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("pdc", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("pdc", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findNnpp(Component root) {
        return (com.codename1.ui.TextField)findByName("nnpp", root);
    }

    public com.codename1.ui.TextField findNnpp() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("nnpp", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("nnpp", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPdm(Component root) {
        return (com.codename1.ui.TextField)findByName("pdm", root);
    }

    public com.codename1.ui.TextField findPdm() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("pdm", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("pdm", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.TextField findPdp(Component root) {
        return (com.codename1.ui.TextField)findByName("pdp", root);
    }

    public com.codename1.ui.TextField findPdp() {
        com.codename1.ui.TextField cmp = (com.codename1.ui.TextField)findByName("pdp", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.TextField)findByName("pdp", aboutToShowThisContainer);
        }
        return cmp;
    }

    public com.codename1.ui.ComboBox findMonTypeCombo(Component root) {
        return (com.codename1.ui.ComboBox)findByName("monTypeCombo", root);
    }

    public com.codename1.ui.ComboBox findMonTypeCombo() {
        com.codename1.ui.ComboBox cmp = (com.codename1.ui.ComboBox)findByName("monTypeCombo", Display.getInstance().getCurrent());
        if(cmp == null && aboutToShowThisContainer != null) {
            cmp = (com.codename1.ui.ComboBox)findByName("monTypeCombo", aboutToShowThisContainer);
        }
        return cmp;
    }

    public static final int COMMAND_IncidentsAttachImageVideo = 2;
    public static final int COMMAND_SplashSIGNIN = 3;
    public static final int COMMAND_MainInfoCenter = 17;
    public static final int COMMAND_MainIncidentReport = 14;
    public static final int COMMAND_InfoCommand12 = 12;
    public static final int COMMAND_InfoCommand13 = 13;
    public static final int COMMAND_InfoCommand10 = 10;
    public static final int COMMAND_InfoCommand11 = 11;
    public static final int COMMAND_SplashREGISTER = 4;
    public static final int COMMAND_MainElectionMonitoring = 16;
    public static final int COMMAND_MainElectionResults = 15;

    protected boolean onIncidentsAttachImageVideo() {
        return false;
    }

    protected boolean onSplashSIGNIN() {
        return false;
    }

    protected boolean onMainInfoCenter() {
        return false;
    }

    protected boolean onMainIncidentReport() {
        return false;
    }

    protected boolean onInfoCommand12() {
        return false;
    }

    protected boolean onInfoCommand13() {
        return false;
    }

    protected boolean onInfoCommand10() {
        return false;
    }

    protected boolean onInfoCommand11() {
        return false;
    }

    protected boolean onSplashREGISTER() {
        return false;
    }

    protected boolean onMainElectionMonitoring() {
        return false;
    }

    protected boolean onMainElectionResults() {
        return false;
    }

    protected void processCommand(ActionEvent ev, Command cmd) {
        switch(cmd.getId()) {
            case COMMAND_IncidentsAttachImageVideo:
                if(onIncidentsAttachImageVideo()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_SplashSIGNIN:
                if(onSplashSIGNIN()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainInfoCenter:
                if(onMainInfoCenter()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainIncidentReport:
                if(onMainIncidentReport()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_InfoCommand12:
                if(onInfoCommand12()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_InfoCommand13:
                if(onInfoCommand13()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_InfoCommand10:
                if(onInfoCommand10()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_InfoCommand11:
                if(onInfoCommand11()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_SplashREGISTER:
                if(onSplashREGISTER()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainElectionMonitoring:
                if(onMainElectionMonitoring()) {
                    ev.consume();
                    return;
                }
                break;

            case COMMAND_MainElectionResults:
                if(onMainElectionResults()) {
                    ev.consume();
                    return;
                }
                break;

        }
        if(ev.getComponent() != null) {
            handleComponentAction(ev.getComponent(), ev);
        }
    }

    protected void exitForm(Form f) {
        if("ElectionResults".equals(f.getName())) {
            exitElectionResults(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("INEC".equals(f.getName())) {
            exitINEC(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("PoliceInfo".equals(f.getName())) {
            exitPoliceInfo(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("PartyAcronyms".equals(f.getName())) {
            exitPartyAcronyms(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ElectionMonitoring".equals(f.getName())) {
            exitElectionMonitoring(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("MediaOptions".equals(f.getName())) {
            exitMediaOptions(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("AddPUDialog".equals(f.getName())) {
            exitAddPUDialog(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("INECOfficers".equals(f.getName())) {
            exitINECOfficers(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Incidents".equals(f.getName())) {
            exitIncidents(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Info".equals(f.getName())) {
            exitInfo(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Register".equals(f.getName())) {
            exitRegister(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SignIn".equals(f.getName())) {
            exitSignIn(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Splash".equals(f.getName())) {
            exitSplash(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            exitMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void exitElectionResults(Form f) {
    }


    protected void exitINEC(Form f) {
    }


    protected void exitPoliceInfo(Form f) {
    }


    protected void exitPartyAcronyms(Form f) {
    }


    protected void exitElectionMonitoring(Form f) {
    }


    protected void exitMediaOptions(Form f) {
    }


    protected void exitAddPUDialog(Form f) {
    }


    protected void exitINECOfficers(Form f) {
    }


    protected void exitIncidents(Form f) {
    }


    protected void exitInfo(Form f) {
    }


    protected void exitRegister(Form f) {
    }


    protected void exitSignIn(Form f) {
    }


    protected void exitSplash(Form f) {
    }


    protected void exitMain(Form f) {
    }

    protected void beforeShow(Form f) {
    aboutToShowThisContainer = f;
        if("ElectionResults".equals(f.getName())) {
            beforeElectionResults(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("INEC".equals(f.getName())) {
            beforeINEC(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("PoliceInfo".equals(f.getName())) {
            beforePoliceInfo(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("PartyAcronyms".equals(f.getName())) {
            beforePartyAcronyms(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ElectionMonitoring".equals(f.getName())) {
            beforeElectionMonitoring(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("MediaOptions".equals(f.getName())) {
            beforeMediaOptions(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("AddPUDialog".equals(f.getName())) {
            beforeAddPUDialog(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("INECOfficers".equals(f.getName())) {
            beforeINECOfficers(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Incidents".equals(f.getName())) {
            beforeIncidents(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Info".equals(f.getName())) {
            beforeInfo(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Register".equals(f.getName())) {
            beforeRegister(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SignIn".equals(f.getName())) {
            beforeSignIn(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Splash".equals(f.getName())) {
            beforeSplash(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            beforeMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeElectionResults(Form f) {
    }


    protected void beforeINEC(Form f) {
    }


    protected void beforePoliceInfo(Form f) {
    }


    protected void beforePartyAcronyms(Form f) {
    }


    protected void beforeElectionMonitoring(Form f) {
    }


    protected void beforeMediaOptions(Form f) {
    }


    protected void beforeAddPUDialog(Form f) {
    }


    protected void beforeINECOfficers(Form f) {
    }


    protected void beforeIncidents(Form f) {
    }


    protected void beforeInfo(Form f) {
    }


    protected void beforeRegister(Form f) {
    }


    protected void beforeSignIn(Form f) {
    }


    protected void beforeSplash(Form f) {
    }


    protected void beforeMain(Form f) {
    }

    protected void beforeShowContainer(Container c) {
        aboutToShowThisContainer = c;
        if("ElectionResults".equals(c.getName())) {
            beforeContainerElectionResults(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("INEC".equals(c.getName())) {
            beforeContainerINEC(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("PoliceInfo".equals(c.getName())) {
            beforeContainerPoliceInfo(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("PartyAcronyms".equals(c.getName())) {
            beforeContainerPartyAcronyms(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ElectionMonitoring".equals(c.getName())) {
            beforeContainerElectionMonitoring(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("MediaOptions".equals(c.getName())) {
            beforeContainerMediaOptions(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("AddPUDialog".equals(c.getName())) {
            beforeContainerAddPUDialog(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("INECOfficers".equals(c.getName())) {
            beforeContainerINECOfficers(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Incidents".equals(c.getName())) {
            beforeContainerIncidents(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Info".equals(c.getName())) {
            beforeContainerInfo(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Register".equals(c.getName())) {
            beforeContainerRegister(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("SignIn".equals(c.getName())) {
            beforeContainerSignIn(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Splash".equals(c.getName())) {
            beforeContainerSplash(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            beforeContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void beforeContainerElectionResults(Container c) {
    }


    protected void beforeContainerINEC(Container c) {
    }


    protected void beforeContainerPoliceInfo(Container c) {
    }


    protected void beforeContainerPartyAcronyms(Container c) {
    }


    protected void beforeContainerElectionMonitoring(Container c) {
    }


    protected void beforeContainerMediaOptions(Container c) {
    }


    protected void beforeContainerAddPUDialog(Container c) {
    }


    protected void beforeContainerINECOfficers(Container c) {
    }


    protected void beforeContainerIncidents(Container c) {
    }


    protected void beforeContainerInfo(Container c) {
    }


    protected void beforeContainerRegister(Container c) {
    }


    protected void beforeContainerSignIn(Container c) {
    }


    protected void beforeContainerSplash(Container c) {
    }


    protected void beforeContainerMain(Container c) {
    }

    protected void postShow(Form f) {
        if("ElectionResults".equals(f.getName())) {
            postElectionResults(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("INEC".equals(f.getName())) {
            postINEC(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("PoliceInfo".equals(f.getName())) {
            postPoliceInfo(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("PartyAcronyms".equals(f.getName())) {
            postPartyAcronyms(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("ElectionMonitoring".equals(f.getName())) {
            postElectionMonitoring(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("MediaOptions".equals(f.getName())) {
            postMediaOptions(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("AddPUDialog".equals(f.getName())) {
            postAddPUDialog(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("INECOfficers".equals(f.getName())) {
            postINECOfficers(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Incidents".equals(f.getName())) {
            postIncidents(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Info".equals(f.getName())) {
            postInfo(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Register".equals(f.getName())) {
            postRegister(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("SignIn".equals(f.getName())) {
            postSignIn(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Splash".equals(f.getName())) {
            postSplash(f);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            postMain(f);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postElectionResults(Form f) {
    }


    protected void postINEC(Form f) {
    }


    protected void postPoliceInfo(Form f) {
    }


    protected void postPartyAcronyms(Form f) {
    }


    protected void postElectionMonitoring(Form f) {
    }


    protected void postMediaOptions(Form f) {
    }


    protected void postAddPUDialog(Form f) {
    }


    protected void postINECOfficers(Form f) {
    }


    protected void postIncidents(Form f) {
    }


    protected void postInfo(Form f) {
    }


    protected void postRegister(Form f) {
    }


    protected void postSignIn(Form f) {
    }


    protected void postSplash(Form f) {
    }


    protected void postMain(Form f) {
    }

    protected void postShowContainer(Container c) {
        if("ElectionResults".equals(c.getName())) {
            postContainerElectionResults(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("INEC".equals(c.getName())) {
            postContainerINEC(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("PoliceInfo".equals(c.getName())) {
            postContainerPoliceInfo(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("PartyAcronyms".equals(c.getName())) {
            postContainerPartyAcronyms(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("ElectionMonitoring".equals(c.getName())) {
            postContainerElectionMonitoring(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("MediaOptions".equals(c.getName())) {
            postContainerMediaOptions(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("AddPUDialog".equals(c.getName())) {
            postContainerAddPUDialog(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("INECOfficers".equals(c.getName())) {
            postContainerINECOfficers(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Incidents".equals(c.getName())) {
            postContainerIncidents(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Info".equals(c.getName())) {
            postContainerInfo(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Register".equals(c.getName())) {
            postContainerRegister(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("SignIn".equals(c.getName())) {
            postContainerSignIn(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Splash".equals(c.getName())) {
            postContainerSplash(c);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(c.getName())) {
            postContainerMain(c);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void postContainerElectionResults(Container c) {
    }


    protected void postContainerINEC(Container c) {
    }


    protected void postContainerPoliceInfo(Container c) {
    }


    protected void postContainerPartyAcronyms(Container c) {
    }


    protected void postContainerElectionMonitoring(Container c) {
    }


    protected void postContainerMediaOptions(Container c) {
    }


    protected void postContainerAddPUDialog(Container c) {
    }


    protected void postContainerINECOfficers(Container c) {
    }


    protected void postContainerIncidents(Container c) {
    }


    protected void postContainerInfo(Container c) {
    }


    protected void postContainerRegister(Container c) {
    }


    protected void postContainerSignIn(Container c) {
    }


    protected void postContainerSplash(Container c) {
    }


    protected void postContainerMain(Container c) {
    }

    protected void onCreateRoot(String rootName) {
        if("ElectionResults".equals(rootName)) {
            onCreateElectionResults();
            aboutToShowThisContainer = null;
            return;
        }

        if("INEC".equals(rootName)) {
            onCreateINEC();
            aboutToShowThisContainer = null;
            return;
        }

        if("PoliceInfo".equals(rootName)) {
            onCreatePoliceInfo();
            aboutToShowThisContainer = null;
            return;
        }

        if("PartyAcronyms".equals(rootName)) {
            onCreatePartyAcronyms();
            aboutToShowThisContainer = null;
            return;
        }

        if("ElectionMonitoring".equals(rootName)) {
            onCreateElectionMonitoring();
            aboutToShowThisContainer = null;
            return;
        }

        if("MediaOptions".equals(rootName)) {
            onCreateMediaOptions();
            aboutToShowThisContainer = null;
            return;
        }

        if("AddPUDialog".equals(rootName)) {
            onCreateAddPUDialog();
            aboutToShowThisContainer = null;
            return;
        }

        if("INECOfficers".equals(rootName)) {
            onCreateINECOfficers();
            aboutToShowThisContainer = null;
            return;
        }

        if("Incidents".equals(rootName)) {
            onCreateIncidents();
            aboutToShowThisContainer = null;
            return;
        }

        if("Info".equals(rootName)) {
            onCreateInfo();
            aboutToShowThisContainer = null;
            return;
        }

        if("Register".equals(rootName)) {
            onCreateRegister();
            aboutToShowThisContainer = null;
            return;
        }

        if("SignIn".equals(rootName)) {
            onCreateSignIn();
            aboutToShowThisContainer = null;
            return;
        }

        if("Splash".equals(rootName)) {
            onCreateSplash();
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(rootName)) {
            onCreateMain();
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void onCreateElectionResults() {
    }


    protected void onCreateINEC() {
    }


    protected void onCreatePoliceInfo() {
    }


    protected void onCreatePartyAcronyms() {
    }


    protected void onCreateElectionMonitoring() {
    }


    protected void onCreateMediaOptions() {
    }


    protected void onCreateAddPUDialog() {
    }


    protected void onCreateINECOfficers() {
    }


    protected void onCreateIncidents() {
    }


    protected void onCreateInfo() {
    }


    protected void onCreateRegister() {
    }


    protected void onCreateSignIn() {
    }


    protected void onCreateSplash() {
    }


    protected void onCreateMain() {
    }

    protected Hashtable getFormState(Form f) {
        Hashtable h = super.getFormState(f);
        if("ElectionResults".equals(f.getName())) {
            getStateElectionResults(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("INEC".equals(f.getName())) {
            getStateINEC(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("PoliceInfo".equals(f.getName())) {
            getStatePoliceInfo(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("PartyAcronyms".equals(f.getName())) {
            getStatePartyAcronyms(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("ElectionMonitoring".equals(f.getName())) {
            getStateElectionMonitoring(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("MediaOptions".equals(f.getName())) {
            getStateMediaOptions(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("AddPUDialog".equals(f.getName())) {
            getStateAddPUDialog(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("INECOfficers".equals(f.getName())) {
            getStateINECOfficers(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Incidents".equals(f.getName())) {
            getStateIncidents(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Info".equals(f.getName())) {
            getStateInfo(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Register".equals(f.getName())) {
            getStateRegister(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("SignIn".equals(f.getName())) {
            getStateSignIn(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Splash".equals(f.getName())) {
            getStateSplash(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

        if("Main".equals(f.getName())) {
            getStateMain(f, h);
            aboutToShowThisContainer = null;
            return h;
        }

            return h;
    }


    protected void getStateElectionResults(Form f, Hashtable h) {
    }


    protected void getStateINEC(Form f, Hashtable h) {
    }


    protected void getStatePoliceInfo(Form f, Hashtable h) {
    }


    protected void getStatePartyAcronyms(Form f, Hashtable h) {
    }


    protected void getStateElectionMonitoring(Form f, Hashtable h) {
    }


    protected void getStateMediaOptions(Form f, Hashtable h) {
    }


    protected void getStateAddPUDialog(Form f, Hashtable h) {
    }


    protected void getStateINECOfficers(Form f, Hashtable h) {
    }


    protected void getStateIncidents(Form f, Hashtable h) {
    }


    protected void getStateInfo(Form f, Hashtable h) {
    }


    protected void getStateRegister(Form f, Hashtable h) {
    }


    protected void getStateSignIn(Form f, Hashtable h) {
    }


    protected void getStateSplash(Form f, Hashtable h) {
    }


    protected void getStateMain(Form f, Hashtable h) {
    }

    protected void setFormState(Form f, Hashtable state) {
        super.setFormState(f, state);
        if("ElectionResults".equals(f.getName())) {
            setStateElectionResults(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("INEC".equals(f.getName())) {
            setStateINEC(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("PoliceInfo".equals(f.getName())) {
            setStatePoliceInfo(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("PartyAcronyms".equals(f.getName())) {
            setStatePartyAcronyms(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("ElectionMonitoring".equals(f.getName())) {
            setStateElectionMonitoring(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("MediaOptions".equals(f.getName())) {
            setStateMediaOptions(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("AddPUDialog".equals(f.getName())) {
            setStateAddPUDialog(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("INECOfficers".equals(f.getName())) {
            setStateINECOfficers(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Incidents".equals(f.getName())) {
            setStateIncidents(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Info".equals(f.getName())) {
            setStateInfo(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Register".equals(f.getName())) {
            setStateRegister(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("SignIn".equals(f.getName())) {
            setStateSignIn(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Splash".equals(f.getName())) {
            setStateSplash(f, state);
            aboutToShowThisContainer = null;
            return;
        }

        if("Main".equals(f.getName())) {
            setStateMain(f, state);
            aboutToShowThisContainer = null;
            return;
        }

            return;
    }


    protected void setStateElectionResults(Form f, Hashtable state) {
    }


    protected void setStateINEC(Form f, Hashtable state) {
    }


    protected void setStatePoliceInfo(Form f, Hashtable state) {
    }


    protected void setStatePartyAcronyms(Form f, Hashtable state) {
    }


    protected void setStateElectionMonitoring(Form f, Hashtable state) {
    }


    protected void setStateMediaOptions(Form f, Hashtable state) {
    }


    protected void setStateAddPUDialog(Form f, Hashtable state) {
    }


    protected void setStateINECOfficers(Form f, Hashtable state) {
    }


    protected void setStateIncidents(Form f, Hashtable state) {
    }


    protected void setStateInfo(Form f, Hashtable state) {
    }


    protected void setStateRegister(Form f, Hashtable state) {
    }


    protected void setStateSignIn(Form f, Hashtable state) {
    }


    protected void setStateSplash(Form f, Hashtable state) {
    }


    protected void setStateMain(Form f, Hashtable state) {
    }

    protected boolean setListModel(List cmp) {
        String listName = cmp.getName();
        if("incidentTypeCombo".equals(listName)) {
            return initListModelIncidentTypeCombo(cmp);
        }
        if("monSecurityCombo".equals(listName)) {
            return initListModelMonSecurityCombo(cmp);
        }
        if("attachMediaList".equals(listName)) {
            return initListModelAttachMediaList(cmp);
        }
        if("monVoteCountedCombo".equals(listName)) {
            return initListModelMonVoteCountedCombo(cmp);
        }
        if("monPucCombo".equals(listName)) {
            return initListModelMonPucCombo(cmp);
        }
        if("electPucCombo".equals(listName)) {
            return initListModelElectPucCombo(cmp);
        }
        if("monAccreditationCombo".equals(listName)) {
            return initListModelMonAccreditationCombo(cmp);
        }
        if("pucCombo".equals(listName)) {
            return initListModelPucCombo(cmp);
        }
        if("monMaterialsCombo".equals(listName)) {
            return initListModelMonMaterialsCombo(cmp);
        }
        if("monResultCombo".equals(listName)) {
            return initListModelMonResultCombo(cmp);
        }
        if("monVotingCombo".equals(listName)) {
            return initListModelMonVotingCombo(cmp);
        }
        if("electTypeCombo".equals(listName)) {
            return initListModelElectTypeCombo(cmp);
        }
        if("electionTypeCombo".equals(listName)) {
            return initListModelElectionTypeCombo(cmp);
        }
        if("monTypeCombo".equals(listName)) {
            return initListModelMonTypeCombo(cmp);
        }
        return super.setListModel(cmp);
    }

    protected boolean initListModelIncidentTypeCombo(List cmp) {
        return false;
    }

    protected boolean initListModelMonSecurityCombo(List cmp) {
        return false;
    }

    protected boolean initListModelAttachMediaList(List cmp) {
        return false;
    }

    protected boolean initListModelMonVoteCountedCombo(List cmp) {
        return false;
    }

    protected boolean initListModelMonPucCombo(List cmp) {
        return false;
    }

    protected boolean initListModelElectPucCombo(List cmp) {
        return false;
    }

    protected boolean initListModelMonAccreditationCombo(List cmp) {
        return false;
    }

    protected boolean initListModelPucCombo(List cmp) {
        return false;
    }

    protected boolean initListModelMonMaterialsCombo(List cmp) {
        return false;
    }

    protected boolean initListModelMonResultCombo(List cmp) {
        return false;
    }

    protected boolean initListModelMonVotingCombo(List cmp) {
        return false;
    }

    protected boolean initListModelElectTypeCombo(List cmp) {
        return false;
    }

    protected boolean initListModelElectionTypeCombo(List cmp) {
        return false;
    }

    protected boolean initListModelMonTypeCombo(List cmp) {
        return false;
    }

    protected void handleComponentAction(Component c, ActionEvent event) {
        Container rootContainerAncestor = getRootAncestor(c);
        if(rootContainerAncestor == null) return;
        String rootContainerName = rootContainerAncestor.getName();
        Container leadParentContainer = c.getParent().getLeadParent();
        if(leadParentContainer != null && leadParentContainer.getClass() != Container.class) {
            c = c.getParent().getLeadParent();
        }
        if(rootContainerName == null) return;
        if(rootContainerName.equals("ElectionResults")) {
            if("electPucCombo".equals(c.getName())) {
                onElectionResults_ElectPucComboAction(c, event);
                return;
            }
            if("addRPUButton".equals(c.getName())) {
                onElectionResults_AddRPUButtonAction(c, event);
                return;
            }
            if("electTypeCombo".equals(c.getName())) {
                onElectionResults_ElectTypeComboAction(c, event);
                return;
            }
            if("apc".equals(c.getName())) {
                onElectionResults_ApcAction(c, event);
                return;
            }
            if("pdp".equals(c.getName())) {
                onElectionResults_PdpAction(c, event);
                return;
            }
            if("a".equals(c.getName())) {
                onElectionResults_AAction(c, event);
                return;
            }
            if("aa".equals(c.getName())) {
                onElectionResults_AaAction(c, event);
                return;
            }
            if("acd".equals(c.getName())) {
                onElectionResults_AcdAction(c, event);
                return;
            }
            if("acpn".equals(c.getName())) {
                onElectionResults_AcpnAction(c, event);
                return;
            }
            if("ad".equals(c.getName())) {
                onElectionResults_AdAction(c, event);
                return;
            }
            if("adc".equals(c.getName())) {
                onElectionResults_AdcAction(c, event);
                return;
            }
            if("apa".equals(c.getName())) {
                onElectionResults_ApaAction(c, event);
                return;
            }
            if("apga".equals(c.getName())) {
                onElectionResults_ApgaAction(c, event);
                return;
            }
            if("cpp".equals(c.getName())) {
                onElectionResults_CppAction(c, event);
                return;
            }
            if("dpp".equals(c.getName())) {
                onElectionResults_DppAction(c, event);
                return;
            }
            if("id".equals(c.getName())) {
                onElectionResults_IdAction(c, event);
                return;
            }
            if("kp".equals(c.getName())) {
                onElectionResults_KpAction(c, event);
                return;
            }
            if("lp".equals(c.getName())) {
                onElectionResults_LpAction(c, event);
                return;
            }
            if("mppp".equals(c.getName())) {
                onElectionResults_MpppAction(c, event);
                return;
            }
            if("ncp".equals(c.getName())) {
                onElectionResults_NcpAction(c, event);
                return;
            }
            if("nnpp".equals(c.getName())) {
                onElectionResults_NnppAction(c, event);
                return;
            }
            if("pdc".equals(c.getName())) {
                onElectionResults_PdcAction(c, event);
                return;
            }
            if("pdm".equals(c.getName())) {
                onElectionResults_PdmAction(c, event);
                return;
            }
            if("ppa".equals(c.getName())) {
                onElectionResults_PpaAction(c, event);
                return;
            }
            if("sdp".equals(c.getName())) {
                onElectionResults_SdpAction(c, event);
                return;
            }
            if("udp".equals(c.getName())) {
                onElectionResults_UdpAction(c, event);
                return;
            }
            if("upn".equals(c.getName())) {
                onElectionResults_UpnAction(c, event);
                return;
            }
            if("upp".equals(c.getName())) {
                onElectionResults_UppAction(c, event);
                return;
            }
            if("ppn".equals(c.getName())) {
                onElectionResults_PpnAction(c, event);
                return;
            }
            if("electComments".equals(c.getName())) {
                onElectionResults_ElectCommentsAction(c, event);
                return;
            }
            if("electSubmitButton".equals(c.getName())) {
                onElectionResults_ElectSubmitButtonAction(c, event);
                return;
            }
            if("electSubmitButtonSms".equals(c.getName())) {
                onElectionResults_ElectSubmitButtonSmsAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("INEC")) {
            if("TextArea".equals(c.getName())) {
                onINEC_TextAreaAction(c, event);
                return;
            }
            if("TextArea1".equals(c.getName())) {
                onINEC_TextArea1Action(c, event);
                return;
            }
            if("TextArea2".equals(c.getName())) {
                onINEC_TextArea2Action(c, event);
                return;
            }
            if("TextArea11".equals(c.getName())) {
                onINEC_TextArea11Action(c, event);
                return;
            }
            if("TextArea3".equals(c.getName())) {
                onINEC_TextArea3Action(c, event);
                return;
            }
            if("TextArea112".equals(c.getName())) {
                onINEC_TextArea112Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("PoliceInfo")) {
            if("TextArea".equals(c.getName())) {
                onPoliceInfo_TextAreaAction(c, event);
                return;
            }
            if("TextArea1".equals(c.getName())) {
                onPoliceInfo_TextArea1Action(c, event);
                return;
            }
            if("TextArea2".equals(c.getName())) {
                onPoliceInfo_TextArea2Action(c, event);
                return;
            }
            if("TextArea11".equals(c.getName())) {
                onPoliceInfo_TextArea11Action(c, event);
                return;
            }
            if("TextArea3".equals(c.getName())) {
                onPoliceInfo_TextArea3Action(c, event);
                return;
            }
            if("TextArea12".equals(c.getName())) {
                onPoliceInfo_TextArea12Action(c, event);
                return;
            }
            if("TextArea4".equals(c.getName())) {
                onPoliceInfo_TextArea4Action(c, event);
                return;
            }
            if("TextArea13".equals(c.getName())) {
                onPoliceInfo_TextArea13Action(c, event);
                return;
            }
            if("TextArea5".equals(c.getName())) {
                onPoliceInfo_TextArea5Action(c, event);
                return;
            }
            if("TextArea14".equals(c.getName())) {
                onPoliceInfo_TextArea14Action(c, event);
                return;
            }
            if("TextArea6".equals(c.getName())) {
                onPoliceInfo_TextArea6Action(c, event);
                return;
            }
            if("TextArea15".equals(c.getName())) {
                onPoliceInfo_TextArea15Action(c, event);
                return;
            }
            if("TextArea7".equals(c.getName())) {
                onPoliceInfo_TextArea7Action(c, event);
                return;
            }
            if("TextArea16".equals(c.getName())) {
                onPoliceInfo_TextArea16Action(c, event);
                return;
            }
            if("TextArea8".equals(c.getName())) {
                onPoliceInfo_TextArea8Action(c, event);
                return;
            }
            if("TextArea17".equals(c.getName())) {
                onPoliceInfo_TextArea17Action(c, event);
                return;
            }
            if("TextArea9".equals(c.getName())) {
                onPoliceInfo_TextArea9Action(c, event);
                return;
            }
            if("TextArea18".equals(c.getName())) {
                onPoliceInfo_TextArea18Action(c, event);
                return;
            }
            if("TextArea10".equals(c.getName())) {
                onPoliceInfo_TextArea10Action(c, event);
                return;
            }
            if("TextArea19".equals(c.getName())) {
                onPoliceInfo_TextArea19Action(c, event);
                return;
            }
            if("TextArea20".equals(c.getName())) {
                onPoliceInfo_TextArea20Action(c, event);
                return;
            }
            if("TextArea110".equals(c.getName())) {
                onPoliceInfo_TextArea110Action(c, event);
                return;
            }
            if("TextArea21".equals(c.getName())) {
                onPoliceInfo_TextArea21Action(c, event);
                return;
            }
            if("TextArea111".equals(c.getName())) {
                onPoliceInfo_TextArea111Action(c, event);
                return;
            }
            if("TextArea22".equals(c.getName())) {
                onPoliceInfo_TextArea22Action(c, event);
                return;
            }
            if("TextArea112".equals(c.getName())) {
                onPoliceInfo_TextArea112Action(c, event);
                return;
            }
            if("TextArea23".equals(c.getName())) {
                onPoliceInfo_TextArea23Action(c, event);
                return;
            }
            if("TextArea113".equals(c.getName())) {
                onPoliceInfo_TextArea113Action(c, event);
                return;
            }
            if("TextArea24".equals(c.getName())) {
                onPoliceInfo_TextArea24Action(c, event);
                return;
            }
            if("TextArea114".equals(c.getName())) {
                onPoliceInfo_TextArea114Action(c, event);
                return;
            }
            if("TextArea25".equals(c.getName())) {
                onPoliceInfo_TextArea25Action(c, event);
                return;
            }
            if("TextArea115".equals(c.getName())) {
                onPoliceInfo_TextArea115Action(c, event);
                return;
            }
            if("TextArea26".equals(c.getName())) {
                onPoliceInfo_TextArea26Action(c, event);
                return;
            }
            if("TextArea116".equals(c.getName())) {
                onPoliceInfo_TextArea116Action(c, event);
                return;
            }
            if("TextArea27".equals(c.getName())) {
                onPoliceInfo_TextArea27Action(c, event);
                return;
            }
            if("TextArea117".equals(c.getName())) {
                onPoliceInfo_TextArea117Action(c, event);
                return;
            }
            if("TextArea28".equals(c.getName())) {
                onPoliceInfo_TextArea28Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("PartyAcronyms")) {
            if("TextArea".equals(c.getName())) {
                onPartyAcronyms_TextAreaAction(c, event);
                return;
            }
            if("TextArea1".equals(c.getName())) {
                onPartyAcronyms_TextArea1Action(c, event);
                return;
            }
            if("TextArea2".equals(c.getName())) {
                onPartyAcronyms_TextArea2Action(c, event);
                return;
            }
            if("TextArea11".equals(c.getName())) {
                onPartyAcronyms_TextArea11Action(c, event);
                return;
            }
            if("TextArea3".equals(c.getName())) {
                onPartyAcronyms_TextArea3Action(c, event);
                return;
            }
            if("TextArea12".equals(c.getName())) {
                onPartyAcronyms_TextArea12Action(c, event);
                return;
            }
            if("TextArea4".equals(c.getName())) {
                onPartyAcronyms_TextArea4Action(c, event);
                return;
            }
            if("TextArea13".equals(c.getName())) {
                onPartyAcronyms_TextArea13Action(c, event);
                return;
            }
            if("TextArea5".equals(c.getName())) {
                onPartyAcronyms_TextArea5Action(c, event);
                return;
            }
            if("TextArea14".equals(c.getName())) {
                onPartyAcronyms_TextArea14Action(c, event);
                return;
            }
            if("TextArea6".equals(c.getName())) {
                onPartyAcronyms_TextArea6Action(c, event);
                return;
            }
            if("TextArea15".equals(c.getName())) {
                onPartyAcronyms_TextArea15Action(c, event);
                return;
            }
            if("TextArea7".equals(c.getName())) {
                onPartyAcronyms_TextArea7Action(c, event);
                return;
            }
            if("TextArea16".equals(c.getName())) {
                onPartyAcronyms_TextArea16Action(c, event);
                return;
            }
            if("TextArea8".equals(c.getName())) {
                onPartyAcronyms_TextArea8Action(c, event);
                return;
            }
            if("TextArea17".equals(c.getName())) {
                onPartyAcronyms_TextArea17Action(c, event);
                return;
            }
            if("TextArea9".equals(c.getName())) {
                onPartyAcronyms_TextArea9Action(c, event);
                return;
            }
            if("TextArea18".equals(c.getName())) {
                onPartyAcronyms_TextArea18Action(c, event);
                return;
            }
            if("TextArea10".equals(c.getName())) {
                onPartyAcronyms_TextArea10Action(c, event);
                return;
            }
            if("TextArea19".equals(c.getName())) {
                onPartyAcronyms_TextArea19Action(c, event);
                return;
            }
            if("TextArea20".equals(c.getName())) {
                onPartyAcronyms_TextArea20Action(c, event);
                return;
            }
            if("TextArea110".equals(c.getName())) {
                onPartyAcronyms_TextArea110Action(c, event);
                return;
            }
            if("TextArea21".equals(c.getName())) {
                onPartyAcronyms_TextArea21Action(c, event);
                return;
            }
            if("TextArea111".equals(c.getName())) {
                onPartyAcronyms_TextArea111Action(c, event);
                return;
            }
            if("TextArea22".equals(c.getName())) {
                onPartyAcronyms_TextArea22Action(c, event);
                return;
            }
            if("TextArea112".equals(c.getName())) {
                onPartyAcronyms_TextArea112Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("ElectionMonitoring")) {
            if("monPucCombo".equals(c.getName())) {
                onElectionMonitoring_MonPucComboAction(c, event);
                return;
            }
            if("addPUButton".equals(c.getName())) {
                onElectionMonitoring_AddPUButtonAction(c, event);
                return;
            }
            if("monTypeCombo".equals(c.getName())) {
                onElectionMonitoring_MonTypeComboAction(c, event);
                return;
            }
            if("monAccreditationCombo".equals(c.getName())) {
                onElectionMonitoring_MonAccreditationComboAction(c, event);
                return;
            }
            if("monMaterialsCombo".equals(c.getName())) {
                onElectionMonitoring_MonMaterialsComboAction(c, event);
                return;
            }
            if("monVotingCombo".equals(c.getName())) {
                onElectionMonitoring_MonVotingComboAction(c, event);
                return;
            }
            if("monVoteCountedCombo".equals(c.getName())) {
                onElectionMonitoring_MonVoteCountedComboAction(c, event);
                return;
            }
            if("monResultCombo".equals(c.getName())) {
                onElectionMonitoring_MonResultComboAction(c, event);
                return;
            }
            if("monSecurityCombo".equals(c.getName())) {
                onElectionMonitoring_MonSecurityComboAction(c, event);
                return;
            }
            if("monComments".equals(c.getName())) {
                onElectionMonitoring_MonCommentsAction(c, event);
                return;
            }
            if("monSubmitButton".equals(c.getName())) {
                onElectionMonitoring_MonSubmitButtonAction(c, event);
                return;
            }
            if("monSubmitButtonSms".equals(c.getName())) {
                onElectionMonitoring_MonSubmitButtonSmsAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("MediaOptions")) {
            if("attachMediaList".equals(c.getName())) {
                onMediaOptions_AttachMediaListAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("AddPUDialog")) {
            if("pucCode1".equals(c.getName())) {
                onAddPUDialog_PucCode1Action(c, event);
                return;
            }
            if("pucCode2".equals(c.getName())) {
                onAddPUDialog_PucCode2Action(c, event);
                return;
            }
            if("pucCode3".equals(c.getName())) {
                onAddPUDialog_PucCode3Action(c, event);
                return;
            }
            if("pucCode4".equals(c.getName())) {
                onAddPUDialog_PucCode4Action(c, event);
                return;
            }
            if("addPUButton".equals(c.getName())) {
                onAddPUDialog_AddPUButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("INECOfficers")) {
            if("TextArea".equals(c.getName())) {
                onINECOfficers_TextAreaAction(c, event);
                return;
            }
            if("TextArea1".equals(c.getName())) {
                onINECOfficers_TextArea1Action(c, event);
                return;
            }
            if("TextArea2".equals(c.getName())) {
                onINECOfficers_TextArea2Action(c, event);
                return;
            }
            if("TextArea11".equals(c.getName())) {
                onINECOfficers_TextArea11Action(c, event);
                return;
            }
            if("TextArea3".equals(c.getName())) {
                onINECOfficers_TextArea3Action(c, event);
                return;
            }
            if("TextArea12".equals(c.getName())) {
                onINECOfficers_TextArea12Action(c, event);
                return;
            }
            if("TextArea4".equals(c.getName())) {
                onINECOfficers_TextArea4Action(c, event);
                return;
            }
            if("TextArea13".equals(c.getName())) {
                onINECOfficers_TextArea13Action(c, event);
                return;
            }
            if("TextArea5".equals(c.getName())) {
                onINECOfficers_TextArea5Action(c, event);
                return;
            }
            if("TextArea14".equals(c.getName())) {
                onINECOfficers_TextArea14Action(c, event);
                return;
            }
            if("TextArea6".equals(c.getName())) {
                onINECOfficers_TextArea6Action(c, event);
                return;
            }
            if("TextArea15".equals(c.getName())) {
                onINECOfficers_TextArea15Action(c, event);
                return;
            }
            if("TextArea7".equals(c.getName())) {
                onINECOfficers_TextArea7Action(c, event);
                return;
            }
            if("TextArea16".equals(c.getName())) {
                onINECOfficers_TextArea16Action(c, event);
                return;
            }
            if("TextArea8".equals(c.getName())) {
                onINECOfficers_TextArea8Action(c, event);
                return;
            }
            if("TextArea17".equals(c.getName())) {
                onINECOfficers_TextArea17Action(c, event);
                return;
            }
            if("TextArea9".equals(c.getName())) {
                onINECOfficers_TextArea9Action(c, event);
                return;
            }
            if("TextArea18".equals(c.getName())) {
                onINECOfficers_TextArea18Action(c, event);
                return;
            }
            if("TextArea10".equals(c.getName())) {
                onINECOfficers_TextArea10Action(c, event);
                return;
            }
            if("TextArea19".equals(c.getName())) {
                onINECOfficers_TextArea19Action(c, event);
                return;
            }
            if("TextArea20".equals(c.getName())) {
                onINECOfficers_TextArea20Action(c, event);
                return;
            }
            if("TextArea110".equals(c.getName())) {
                onINECOfficers_TextArea110Action(c, event);
                return;
            }
            if("TextArea21".equals(c.getName())) {
                onINECOfficers_TextArea21Action(c, event);
                return;
            }
            if("TextArea111".equals(c.getName())) {
                onINECOfficers_TextArea111Action(c, event);
                return;
            }
            if("TextArea22".equals(c.getName())) {
                onINECOfficers_TextArea22Action(c, event);
                return;
            }
            if("TextArea112".equals(c.getName())) {
                onINECOfficers_TextArea112Action(c, event);
                return;
            }
            if("TextArea23".equals(c.getName())) {
                onINECOfficers_TextArea23Action(c, event);
                return;
            }
            if("TextArea113".equals(c.getName())) {
                onINECOfficers_TextArea113Action(c, event);
                return;
            }
            if("TextArea24".equals(c.getName())) {
                onINECOfficers_TextArea24Action(c, event);
                return;
            }
            if("TextArea114".equals(c.getName())) {
                onINECOfficers_TextArea114Action(c, event);
                return;
            }
            if("TextArea25".equals(c.getName())) {
                onINECOfficers_TextArea25Action(c, event);
                return;
            }
            if("TextArea115".equals(c.getName())) {
                onINECOfficers_TextArea115Action(c, event);
                return;
            }
            if("TextArea26".equals(c.getName())) {
                onINECOfficers_TextArea26Action(c, event);
                return;
            }
            if("TextArea116".equals(c.getName())) {
                onINECOfficers_TextArea116Action(c, event);
                return;
            }
            if("TextArea27".equals(c.getName())) {
                onINECOfficers_TextArea27Action(c, event);
                return;
            }
            if("TextArea117".equals(c.getName())) {
                onINECOfficers_TextArea117Action(c, event);
                return;
            }
            if("TextArea28".equals(c.getName())) {
                onINECOfficers_TextArea28Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Incidents")) {
            if("pucCombo".equals(c.getName())) {
                onIncidents_PucComboAction(c, event);
                return;
            }
            if("addIPUButton".equals(c.getName())) {
                onIncidents_AddIPUButtonAction(c, event);
                return;
            }
            if("incidentTypeCombo".equals(c.getName())) {
                onIncidents_IncidentTypeComboAction(c, event);
                return;
            }
            if("electionTypeCombo".equals(c.getName())) {
                onIncidents_ElectionTypeComboAction(c, event);
                return;
            }
            if("attachMediaButton".equals(c.getName())) {
                onIncidents_AttachMediaButtonAction(c, event);
                return;
            }
            if("comments".equals(c.getName())) {
                onIncidents_CommentsAction(c, event);
                return;
            }
            if("submitButton".equals(c.getName())) {
                onIncidents_SubmitButtonAction(c, event);
                return;
            }
            if("submitButtonSms".equals(c.getName())) {
                onIncidents_SubmitButtonSmsAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Info")) {
            if("MultiButton".equals(c.getName())) {
                onInfo_MultiButtonAction(c, event);
                return;
            }
            if("MultiButton1".equals(c.getName())) {
                onInfo_MultiButton1Action(c, event);
                return;
            }
            if("MultiButton2".equals(c.getName())) {
                onInfo_MultiButton2Action(c, event);
                return;
            }
            if("MultiButton3".equals(c.getName())) {
                onInfo_MultiButton3Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Register")) {
            if("fullName".equals(c.getName())) {
                onRegister_FullNameAction(c, event);
                return;
            }
            if("phone".equals(c.getName())) {
                onRegister_PhoneAction(c, event);
                return;
            }
            if("registerButton".equals(c.getName())) {
                onRegister_RegisterButtonAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("SignIn")) {
            if("phoneNumber".equals(c.getName())) {
                onSignIn_PhoneNumberAction(c, event);
                return;
            }
            if("password".equals(c.getName())) {
                onSignIn_PasswordAction(c, event);
                return;
            }
            if("signInBtn".equals(c.getName())) {
                onSignIn_SignInBtnAction(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Splash")) {
            if("sloganTextArea".equals(c.getName())) {
                onSplash_SloganTextAreaAction(c, event);
                return;
            }
            if("Button".equals(c.getName())) {
                onSplash_ButtonAction(c, event);
                return;
            }
            if("Button1".equals(c.getName())) {
                onSplash_Button1Action(c, event);
                return;
            }
        }
        if(rootContainerName.equals("Main")) {
            if("Button4".equals(c.getName())) {
                onMain_Button4Action(c, event);
                return;
            }
            if("Button41".equals(c.getName())) {
                onMain_Button41Action(c, event);
                return;
            }
            if("Button42".equals(c.getName())) {
                onMain_Button42Action(c, event);
                return;
            }
            if("Button43".equals(c.getName())) {
                onMain_Button43Action(c, event);
                return;
            }
        }
    }

      protected void onElectionResults_ElectPucComboAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_AddRPUButtonAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_ElectTypeComboAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_ApcAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_PdpAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_AAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_AaAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_AcdAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_AcpnAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_AdAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_AdcAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_ApaAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_ApgaAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_CppAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_DppAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_IdAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_KpAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_LpAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_MpppAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_NcpAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_NnppAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_PdcAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_PdmAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_PpaAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_SdpAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_UdpAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_UpnAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_UppAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_PpnAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_ElectCommentsAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_ElectSubmitButtonAction(Component c, ActionEvent event) {
      }

      protected void onElectionResults_ElectSubmitButtonSmsAction(Component c, ActionEvent event) {
      }

      protected void onINEC_TextAreaAction(Component c, ActionEvent event) {
      }

      protected void onINEC_TextArea1Action(Component c, ActionEvent event) {
      }

      protected void onINEC_TextArea2Action(Component c, ActionEvent event) {
      }

      protected void onINEC_TextArea11Action(Component c, ActionEvent event) {
      }

      protected void onINEC_TextArea3Action(Component c, ActionEvent event) {
      }

      protected void onINEC_TextArea112Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextAreaAction(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea1Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea2Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea11Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea3Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea12Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea4Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea13Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea5Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea14Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea6Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea15Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea7Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea16Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea8Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea17Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea9Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea18Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea10Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea19Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea20Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea110Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea21Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea111Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea22Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea112Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea23Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea113Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea24Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea114Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea25Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea115Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea26Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea116Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea27Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea117Action(Component c, ActionEvent event) {
      }

      protected void onPoliceInfo_TextArea28Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextAreaAction(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea1Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea2Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea11Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea3Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea12Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea4Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea13Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea5Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea14Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea6Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea15Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea7Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea16Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea8Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea17Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea9Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea18Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea10Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea19Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea20Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea110Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea21Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea111Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea22Action(Component c, ActionEvent event) {
      }

      protected void onPartyAcronyms_TextArea112Action(Component c, ActionEvent event) {
      }

      protected void onElectionMonitoring_MonPucComboAction(Component c, ActionEvent event) {
      }

      protected void onElectionMonitoring_AddPUButtonAction(Component c, ActionEvent event) {
      }

      protected void onElectionMonitoring_MonTypeComboAction(Component c, ActionEvent event) {
      }

      protected void onElectionMonitoring_MonAccreditationComboAction(Component c, ActionEvent event) {
      }

      protected void onElectionMonitoring_MonMaterialsComboAction(Component c, ActionEvent event) {
      }

      protected void onElectionMonitoring_MonVotingComboAction(Component c, ActionEvent event) {
      }

      protected void onElectionMonitoring_MonVoteCountedComboAction(Component c, ActionEvent event) {
      }

      protected void onElectionMonitoring_MonResultComboAction(Component c, ActionEvent event) {
      }

      protected void onElectionMonitoring_MonSecurityComboAction(Component c, ActionEvent event) {
      }

      protected void onElectionMonitoring_MonCommentsAction(Component c, ActionEvent event) {
      }

      protected void onElectionMonitoring_MonSubmitButtonAction(Component c, ActionEvent event) {
      }

      protected void onElectionMonitoring_MonSubmitButtonSmsAction(Component c, ActionEvent event) {
      }

      protected void onMediaOptions_AttachMediaListAction(Component c, ActionEvent event) {
      }

      protected void onAddPUDialog_PucCode1Action(Component c, ActionEvent event) {
      }

      protected void onAddPUDialog_PucCode2Action(Component c, ActionEvent event) {
      }

      protected void onAddPUDialog_PucCode3Action(Component c, ActionEvent event) {
      }

      protected void onAddPUDialog_PucCode4Action(Component c, ActionEvent event) {
      }

      protected void onAddPUDialog_AddPUButtonAction(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextAreaAction(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea1Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea2Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea11Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea3Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea12Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea4Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea13Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea5Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea14Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea6Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea15Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea7Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea16Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea8Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea17Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea9Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea18Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea10Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea19Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea20Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea110Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea21Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea111Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea22Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea112Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea23Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea113Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea24Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea114Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea25Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea115Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea26Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea116Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea27Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea117Action(Component c, ActionEvent event) {
      }

      protected void onINECOfficers_TextArea28Action(Component c, ActionEvent event) {
      }

      protected void onIncidents_PucComboAction(Component c, ActionEvent event) {
      }

      protected void onIncidents_AddIPUButtonAction(Component c, ActionEvent event) {
      }

      protected void onIncidents_IncidentTypeComboAction(Component c, ActionEvent event) {
      }

      protected void onIncidents_ElectionTypeComboAction(Component c, ActionEvent event) {
      }

      protected void onIncidents_AttachMediaButtonAction(Component c, ActionEvent event) {
      }

      protected void onIncidents_CommentsAction(Component c, ActionEvent event) {
      }

      protected void onIncidents_SubmitButtonAction(Component c, ActionEvent event) {
      }

      protected void onIncidents_SubmitButtonSmsAction(Component c, ActionEvent event) {
      }

      protected void onInfo_MultiButtonAction(Component c, ActionEvent event) {
      }

      protected void onInfo_MultiButton1Action(Component c, ActionEvent event) {
      }

      protected void onInfo_MultiButton2Action(Component c, ActionEvent event) {
      }

      protected void onInfo_MultiButton3Action(Component c, ActionEvent event) {
      }

      protected void onRegister_FullNameAction(Component c, ActionEvent event) {
      }

      protected void onRegister_PhoneAction(Component c, ActionEvent event) {
      }

      protected void onRegister_RegisterButtonAction(Component c, ActionEvent event) {
      }

      protected void onSignIn_PhoneNumberAction(Component c, ActionEvent event) {
      }

      protected void onSignIn_PasswordAction(Component c, ActionEvent event) {
      }

      protected void onSignIn_SignInBtnAction(Component c, ActionEvent event) {
      }

      protected void onSplash_SloganTextAreaAction(Component c, ActionEvent event) {
      }

      protected void onSplash_ButtonAction(Component c, ActionEvent event) {
      }

      protected void onSplash_Button1Action(Component c, ActionEvent event) {
      }

      protected void onMain_Button4Action(Component c, ActionEvent event) {
      }

      protected void onMain_Button41Action(Component c, ActionEvent event) {
      }

      protected void onMain_Button42Action(Component c, ActionEvent event) {
      }

      protected void onMain_Button43Action(Component c, ActionEvent event) {
      }

}
