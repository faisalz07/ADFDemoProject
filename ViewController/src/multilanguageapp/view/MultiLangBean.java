package multilanguageapp.view;

import java.io.Serializable;

import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;

public class MultiLangBean implements Serializable {
    private RichSelectOneChoice userLocaleSelection;
    private String userLocale = "en_US";
    
    public MultiLangBean() {
    }

    public void setUserLocaleSelection(RichSelectOneChoice userLocaleSelection) {
        this.userLocaleSelection = userLocaleSelection;
    }

    public RichSelectOneChoice getUserLocaleSelection() {
        return userLocaleSelection;
    }

    public void setUserLocale(String userLocale) {
        this.userLocale = userLocale;
    }

    public String getUserLocale() {
        return userLocale;
    }
}
