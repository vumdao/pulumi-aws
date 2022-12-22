// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.aws.connect.outputs.GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfig {
    /**
     * @return The encryption configuration. Documented below.
     * 
     */
    private List<GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig> encryptionConfigs;
    /**
     * @return The prefix of the video stream. Minimum length of `1`. Maximum length of `128`. When read from the state, the value returned is `&lt;prefix&gt;-connect-&lt;connect_instance_alias&gt;-contact-` since the API appends additional details to the `prefix`.
     * 
     */
    private String prefix;
    /**
     * @return The number of hours to retain the data in a data store associated with the stream. Minimum value of `0`. Maximum value of `87600`. A value of `0` indicates that the stream does not persist data.
     * 
     */
    private Integer retentionPeriodHours;

    private GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfig() {}
    /**
     * @return The encryption configuration. Documented below.
     * 
     */
    public List<GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig> encryptionConfigs() {
        return this.encryptionConfigs;
    }
    /**
     * @return The prefix of the video stream. Minimum length of `1`. Maximum length of `128`. When read from the state, the value returned is `&lt;prefix&gt;-connect-&lt;connect_instance_alias&gt;-contact-` since the API appends additional details to the `prefix`.
     * 
     */
    public String prefix() {
        return this.prefix;
    }
    /**
     * @return The number of hours to retain the data in a data store associated with the stream. Minimum value of `0`. Maximum value of `87600`. A value of `0` indicates that the stream does not persist data.
     * 
     */
    public Integer retentionPeriodHours() {
        return this.retentionPeriodHours;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig> encryptionConfigs;
        private String prefix;
        private Integer retentionPeriodHours;
        public Builder() {}
        public Builder(GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionConfigs = defaults.encryptionConfigs;
    	      this.prefix = defaults.prefix;
    	      this.retentionPeriodHours = defaults.retentionPeriodHours;
        }

        @CustomType.Setter
        public Builder encryptionConfigs(List<GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig> encryptionConfigs) {
            this.encryptionConfigs = Objects.requireNonNull(encryptionConfigs);
            return this;
        }
        public Builder encryptionConfigs(GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfig... encryptionConfigs) {
            return encryptionConfigs(List.of(encryptionConfigs));
        }
        @CustomType.Setter
        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }
        @CustomType.Setter
        public Builder retentionPeriodHours(Integer retentionPeriodHours) {
            this.retentionPeriodHours = Objects.requireNonNull(retentionPeriodHours);
            return this;
        }
        public GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfig build() {
            final var o = new GetInstanceStorageConfigStorageConfigKinesisVideoStreamConfig();
            o.encryptionConfigs = encryptionConfigs;
            o.prefix = prefix;
            o.retentionPeriodHours = retentionPeriodHours;
            return o;
        }
    }
}