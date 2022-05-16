package top.smartsoftware.datagram.model.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PlatformSecretDTO {
    private Integer id;
    private String platformName;
    @JsonIgnore
    private String dataSecret;
    @JsonIgnore
    private String dataSecretIv;

    public PlatformSecretDTO() {
    }

    public PlatformSecretDTO(Integer id, String platformName, String dataSecret, String dataSecretIv) {
        this.id = id;
        this.platformName = platformName;
        this.dataSecret = dataSecret;
        this.dataSecretIv = dataSecretIv;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getDataSecret() {
        return dataSecret;
    }

    public void setDataSecret(String dataSecret) {
        this.dataSecret = dataSecret;
    }

    public String getDataSecretIv() {
        return dataSecretIv;
    }

    public void setDataSecretIv(String dataSecretIv) {
        this.dataSecretIv = dataSecretIv;
    }
}
