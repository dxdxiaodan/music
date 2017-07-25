package cn.music.po;

public class Language {
    private Integer languageid;

    private String languagevalue;

    public Integer getLanguageid() {
        return languageid;
    }

    public void setLanguageid(Integer languageid) {
        this.languageid = languageid;
    }

    public String getLanguagevalue() {
        return languagevalue;
    }

    public void setLanguagevalue(String languagevalue) {
        this.languagevalue = languagevalue == null ? null : languagevalue.trim();
    }
}