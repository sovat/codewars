package modify_xml.dto;


import java.util.List;

public class InstanceDataPostDTO {

    public InstanceDataPostDTO() {
    }

    public InstanceDataPostDTO(List<InstanceDataDTO> dataList) {
        this.dataList = dataList;
    }

    private List<InstanceDataDTO> dataList;

    public List<InstanceDataDTO> getDataList() {
        return dataList;
    }

    public void setDataList(List<InstanceDataDTO> dataList) {
        this.dataList = dataList;
    }
}
