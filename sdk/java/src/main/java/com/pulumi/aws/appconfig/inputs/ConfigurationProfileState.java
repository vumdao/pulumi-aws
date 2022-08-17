// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appconfig.inputs;

import com.pulumi.aws.appconfig.inputs.ConfigurationProfileValidatorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationProfileState extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationProfileState Empty = new ConfigurationProfileState();

    /**
     * The application ID. Must be between 4 and 7 characters in length.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    /**
     * @return The application ID. Must be between 4 and 7 characters in length.
     * 
     */
    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * The Amazon Resource Name (ARN) of the AppConfig Configuration Profile.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the AppConfig Configuration Profile.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The configuration profile ID.
     * 
     */
    @Import(name="configurationProfileId")
    private @Nullable Output<String> configurationProfileId;

    /**
     * @return The configuration profile ID.
     * 
     */
    public Optional<Output<String>> configurationProfileId() {
        return Optional.ofNullable(this.configurationProfileId);
    }

    /**
     * The description of the configuration profile. Can be at most 1024 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the configuration profile. Can be at most 1024 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A URI to locate the configuration. You can specify the AWS AppConfig hosted configuration store, Systems Manager (SSM) document, an SSM Parameter Store parameter, or an Amazon S3 object. For the hosted configuration store, specify `hosted`. For an SSM document, specify either the document name in the format `ssm-document://&lt;Document_name&gt;` or the Amazon Resource Name (ARN). For a parameter, specify either the parameter name in the format `ssm-parameter://&lt;Parameter_name&gt;` or the ARN. For an Amazon S3 object, specify the URI in the following format: `s3://&lt;bucket&gt;/&lt;objectKey&gt;`.
     * 
     */
    @Import(name="locationUri")
    private @Nullable Output<String> locationUri;

    /**
     * @return A URI to locate the configuration. You can specify the AWS AppConfig hosted configuration store, Systems Manager (SSM) document, an SSM Parameter Store parameter, or an Amazon S3 object. For the hosted configuration store, specify `hosted`. For an SSM document, specify either the document name in the format `ssm-document://&lt;Document_name&gt;` or the Amazon Resource Name (ARN). For a parameter, specify either the parameter name in the format `ssm-parameter://&lt;Parameter_name&gt;` or the ARN. For an Amazon S3 object, specify the URI in the following format: `s3://&lt;bucket&gt;/&lt;objectKey&gt;`.
     * 
     */
    public Optional<Output<String>> locationUri() {
        return Optional.ofNullable(this.locationUri);
    }

    /**
     * The name for the configuration profile. Must be between 1 and 64 characters in length.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for the configuration profile. Must be between 1 and 64 characters in length.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ARN of an IAM role with permission to access the configuration at the specified `location_uri`. A retrieval role ARN is not required for configurations stored in the AWS AppConfig `hosted` configuration store. It is required for all other sources that store your configuration.
     * 
     */
    @Import(name="retrievalRoleArn")
    private @Nullable Output<String> retrievalRoleArn;

    /**
     * @return The ARN of an IAM role with permission to access the configuration at the specified `location_uri`. A retrieval role ARN is not required for configurations stored in the AWS AppConfig `hosted` configuration store. It is required for all other sources that store your configuration.
     * 
     */
    public Optional<Output<String>> retrievalRoleArn() {
        return Optional.ofNullable(this.retrievalRoleArn);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The type of configurations contained in the profile. Valid values: `AWS.AppConfig.FeatureFlags` and `AWS.Freeform`.  Default: `AWS.Freeform`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of configurations contained in the profile. Valid values: `AWS.AppConfig.FeatureFlags` and `AWS.Freeform`.  Default: `AWS.Freeform`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * A set of methods for validating the configuration. Maximum of 2. See Validator below for more details.
     * 
     */
    @Import(name="validators")
    private @Nullable Output<List<ConfigurationProfileValidatorArgs>> validators;

    /**
     * @return A set of methods for validating the configuration. Maximum of 2. See Validator below for more details.
     * 
     */
    public Optional<Output<List<ConfigurationProfileValidatorArgs>>> validators() {
        return Optional.ofNullable(this.validators);
    }

    private ConfigurationProfileState() {}

    private ConfigurationProfileState(ConfigurationProfileState $) {
        this.applicationId = $.applicationId;
        this.arn = $.arn;
        this.configurationProfileId = $.configurationProfileId;
        this.description = $.description;
        this.locationUri = $.locationUri;
        this.name = $.name;
        this.retrievalRoleArn = $.retrievalRoleArn;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.type = $.type;
        this.validators = $.validators;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationProfileState $;

        public Builder() {
            $ = new ConfigurationProfileState();
        }

        public Builder(ConfigurationProfileState defaults) {
            $ = new ConfigurationProfileState(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId The application ID. Must be between 4 and 7 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId The application ID. Must be between 4 and 7 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the AppConfig Configuration Profile.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the AppConfig Configuration Profile.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param configurationProfileId The configuration profile ID.
         * 
         * @return builder
         * 
         */
        public Builder configurationProfileId(@Nullable Output<String> configurationProfileId) {
            $.configurationProfileId = configurationProfileId;
            return this;
        }

        /**
         * @param configurationProfileId The configuration profile ID.
         * 
         * @return builder
         * 
         */
        public Builder configurationProfileId(String configurationProfileId) {
            return configurationProfileId(Output.of(configurationProfileId));
        }

        /**
         * @param description The description of the configuration profile. Can be at most 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the configuration profile. Can be at most 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param locationUri A URI to locate the configuration. You can specify the AWS AppConfig hosted configuration store, Systems Manager (SSM) document, an SSM Parameter Store parameter, or an Amazon S3 object. For the hosted configuration store, specify `hosted`. For an SSM document, specify either the document name in the format `ssm-document://&lt;Document_name&gt;` or the Amazon Resource Name (ARN). For a parameter, specify either the parameter name in the format `ssm-parameter://&lt;Parameter_name&gt;` or the ARN. For an Amazon S3 object, specify the URI in the following format: `s3://&lt;bucket&gt;/&lt;objectKey&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder locationUri(@Nullable Output<String> locationUri) {
            $.locationUri = locationUri;
            return this;
        }

        /**
         * @param locationUri A URI to locate the configuration. You can specify the AWS AppConfig hosted configuration store, Systems Manager (SSM) document, an SSM Parameter Store parameter, or an Amazon S3 object. For the hosted configuration store, specify `hosted`. For an SSM document, specify either the document name in the format `ssm-document://&lt;Document_name&gt;` or the Amazon Resource Name (ARN). For a parameter, specify either the parameter name in the format `ssm-parameter://&lt;Parameter_name&gt;` or the ARN. For an Amazon S3 object, specify the URI in the following format: `s3://&lt;bucket&gt;/&lt;objectKey&gt;`.
         * 
         * @return builder
         * 
         */
        public Builder locationUri(String locationUri) {
            return locationUri(Output.of(locationUri));
        }

        /**
         * @param name The name for the configuration profile. Must be between 1 and 64 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the configuration profile. Must be between 1 and 64 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param retrievalRoleArn The ARN of an IAM role with permission to access the configuration at the specified `location_uri`. A retrieval role ARN is not required for configurations stored in the AWS AppConfig `hosted` configuration store. It is required for all other sources that store your configuration.
         * 
         * @return builder
         * 
         */
        public Builder retrievalRoleArn(@Nullable Output<String> retrievalRoleArn) {
            $.retrievalRoleArn = retrievalRoleArn;
            return this;
        }

        /**
         * @param retrievalRoleArn The ARN of an IAM role with permission to access the configuration at the specified `location_uri`. A retrieval role ARN is not required for configurations stored in the AWS AppConfig `hosted` configuration store. It is required for all other sources that store your configuration.
         * 
         * @return builder
         * 
         */
        public Builder retrievalRoleArn(String retrievalRoleArn) {
            return retrievalRoleArn(Output.of(retrievalRoleArn));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param type The type of configurations contained in the profile. Valid values: `AWS.AppConfig.FeatureFlags` and `AWS.Freeform`.  Default: `AWS.Freeform`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of configurations contained in the profile. Valid values: `AWS.AppConfig.FeatureFlags` and `AWS.Freeform`.  Default: `AWS.Freeform`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param validators A set of methods for validating the configuration. Maximum of 2. See Validator below for more details.
         * 
         * @return builder
         * 
         */
        public Builder validators(@Nullable Output<List<ConfigurationProfileValidatorArgs>> validators) {
            $.validators = validators;
            return this;
        }

        /**
         * @param validators A set of methods for validating the configuration. Maximum of 2. See Validator below for more details.
         * 
         * @return builder
         * 
         */
        public Builder validators(List<ConfigurationProfileValidatorArgs> validators) {
            return validators(Output.of(validators));
        }

        /**
         * @param validators A set of methods for validating the configuration. Maximum of 2. See Validator below for more details.
         * 
         * @return builder
         * 
         */
        public Builder validators(ConfigurationProfileValidatorArgs... validators) {
            return validators(List.of(validators));
        }

        public ConfigurationProfileState build() {
            return $;
        }
    }

}