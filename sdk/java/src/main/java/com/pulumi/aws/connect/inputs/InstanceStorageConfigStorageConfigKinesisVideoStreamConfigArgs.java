// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.inputs;

import com.pulumi.aws.connect.inputs.InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs Empty = new InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs();

    /**
     * The encryption configuration. Documented below.
     * 
     */
    @Import(name="encryptionConfig", required=true)
    private Output<InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfigArgs> encryptionConfig;

    /**
     * @return The encryption configuration. Documented below.
     * 
     */
    public Output<InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfigArgs> encryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * The prefix of the video stream. Minimum length of `1`. Maximum length of `128`. When read from the state, the value returned is `&lt;prefix&gt;-connect-&lt;connect_instance_alias&gt;-contact-` since the API appends additional details to the `prefix`.
     * 
     */
    @Import(name="prefix", required=true)
    private Output<String> prefix;

    /**
     * @return The prefix of the video stream. Minimum length of `1`. Maximum length of `128`. When read from the state, the value returned is `&lt;prefix&gt;-connect-&lt;connect_instance_alias&gt;-contact-` since the API appends additional details to the `prefix`.
     * 
     */
    public Output<String> prefix() {
        return this.prefix;
    }

    /**
     * The number of hours data is retained in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. Minimum value of `0`. Maximum value of `87600`. A value of `0`, indicates that the stream does not persist data.
     * 
     */
    @Import(name="retentionPeriodHours", required=true)
    private Output<Integer> retentionPeriodHours;

    /**
     * @return The number of hours data is retained in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. Minimum value of `0`. Maximum value of `87600`. A value of `0`, indicates that the stream does not persist data.
     * 
     */
    public Output<Integer> retentionPeriodHours() {
        return this.retentionPeriodHours;
    }

    private InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs() {}

    private InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs(InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs $) {
        this.encryptionConfig = $.encryptionConfig;
        this.prefix = $.prefix;
        this.retentionPeriodHours = $.retentionPeriodHours;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs $;

        public Builder() {
            $ = new InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs();
        }

        public Builder(InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs defaults) {
            $ = new InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param encryptionConfig The encryption configuration. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfig(Output<InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfigArgs> encryptionConfig) {
            $.encryptionConfig = encryptionConfig;
            return this;
        }

        /**
         * @param encryptionConfig The encryption configuration. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfig(InstanceStorageConfigStorageConfigKinesisVideoStreamConfigEncryptionConfigArgs encryptionConfig) {
            return encryptionConfig(Output.of(encryptionConfig));
        }

        /**
         * @param prefix The prefix of the video stream. Minimum length of `1`. Maximum length of `128`. When read from the state, the value returned is `&lt;prefix&gt;-connect-&lt;connect_instance_alias&gt;-contact-` since the API appends additional details to the `prefix`.
         * 
         * @return builder
         * 
         */
        public Builder prefix(Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        /**
         * @param prefix The prefix of the video stream. Minimum length of `1`. Maximum length of `128`. When read from the state, the value returned is `&lt;prefix&gt;-connect-&lt;connect_instance_alias&gt;-contact-` since the API appends additional details to the `prefix`.
         * 
         * @return builder
         * 
         */
        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        /**
         * @param retentionPeriodHours The number of hours data is retained in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. Minimum value of `0`. Maximum value of `87600`. A value of `0`, indicates that the stream does not persist data.
         * 
         * @return builder
         * 
         */
        public Builder retentionPeriodHours(Output<Integer> retentionPeriodHours) {
            $.retentionPeriodHours = retentionPeriodHours;
            return this;
        }

        /**
         * @param retentionPeriodHours The number of hours data is retained in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. Minimum value of `0`. Maximum value of `87600`. A value of `0`, indicates that the stream does not persist data.
         * 
         * @return builder
         * 
         */
        public Builder retentionPeriodHours(Integer retentionPeriodHours) {
            return retentionPeriodHours(Output.of(retentionPeriodHours));
        }

        public InstanceStorageConfigStorageConfigKinesisVideoStreamConfigArgs build() {
            $.encryptionConfig = Objects.requireNonNull($.encryptionConfig, "expected parameter 'encryptionConfig' to be non-null");
            $.prefix = Objects.requireNonNull($.prefix, "expected parameter 'prefix' to be non-null");
            $.retentionPeriodHours = Objects.requireNonNull($.retentionPeriodHours, "expected parameter 'retentionPeriodHours' to be non-null");
            return $;
        }
    }

}