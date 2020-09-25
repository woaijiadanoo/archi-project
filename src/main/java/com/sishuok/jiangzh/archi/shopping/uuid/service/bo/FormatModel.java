package com.sishuok.jiangzh.archi.shopping.uuid.service.bo;

/*
集团001号文  集团010号文  集团321号文
 */
public class FormatModel {

    public FormatModel(){}

    public FormatModel(boolean needFormat,String result,String replaceStr,int idLength){
        this.needFormat = needFormat;
        this.result = result;
        this.replaceStr = replaceStr;
        this.idLength = idLength;
    }

    // 是否需要格式化, 集团#号文
    private boolean needFormat;
    // 格式化好的字符串，集团#号文 -> 集团001号文
    private String result;
    // 填充的字符串, 0
    private String replaceStr;
    // 填充编号的长度
    private int idLength;

    public boolean isNeedFormat() {
        return needFormat;
    }

    public void setNeedFormat(boolean needFormat) {
        this.needFormat = needFormat;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getReplaceStr() {
        return replaceStr;
    }

    public void setReplaceStr(String replaceStr) {
        this.replaceStr = replaceStr;
    }

    public int getIdLength() {
        return idLength;
    }

    public void setIdLength(int idLength) {
        this.idLength = idLength;
    }
}
