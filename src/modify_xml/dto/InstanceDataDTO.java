package modify_xml.dto;


public class InstanceDataDTO {


    public InstanceDataDTO(String instanceValue, String bigValue, String templateFieldsRid, Long sprLink) {
        this.instanceValue = instanceValue;
        this.bigValue = bigValue;
        this.templateFieldsRid = templateFieldsRid;
        this.sprLink = sprLink;
    }

    private String instanceValue;

    private String bigValue;

    private String templateFieldsRid;

    private Long sprLink;


    public String getInstanceValue() {
        return instanceValue;
    }

    public void setInstanceValue(String instanceValue) {
        this.instanceValue = instanceValue;
    }

    public String getBigValue() {
        return bigValue;
    }

    public void setBigValue(String bigValue) {
        this.bigValue = bigValue;
    }

    public String getTemplateFieldsRid() {
        return templateFieldsRid;
    }

    public void setTemplateFieldsRid(String templateFieldsRid) {
        this.templateFieldsRid = templateFieldsRid;
    }

    public Long getSprLink() {
        return sprLink;
    }

    public void setSprLink(Long sprLink) {
        this.sprLink = sprLink;
    }
}
