// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UserProfileUserSettingsSharingSettings {
    /**
     * @return Whether to include the notebook cell output when sharing the notebook. The default is `Disabled`. Valid values are `Allowed` and `Disabled`.
     * 
     */
    private final @Nullable String notebookOutputOption;
    /**
     * @return When `notebook_output_option` is Allowed, the AWS Key Management Service (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
     * 
     */
    private final @Nullable String s3KmsKeyId;
    /**
     * @return When `notebook_output_option` is Allowed, the Amazon S3 bucket used to save the notebook cell output.
     * 
     */
    private final @Nullable String s3OutputPath;

    @CustomType.Constructor
    private UserProfileUserSettingsSharingSettings(
        @CustomType.Parameter("notebookOutputOption") @Nullable String notebookOutputOption,
        @CustomType.Parameter("s3KmsKeyId") @Nullable String s3KmsKeyId,
        @CustomType.Parameter("s3OutputPath") @Nullable String s3OutputPath) {
        this.notebookOutputOption = notebookOutputOption;
        this.s3KmsKeyId = s3KmsKeyId;
        this.s3OutputPath = s3OutputPath;
    }

    /**
     * @return Whether to include the notebook cell output when sharing the notebook. The default is `Disabled`. Valid values are `Allowed` and `Disabled`.
     * 
     */
    public Optional<String> notebookOutputOption() {
        return Optional.ofNullable(this.notebookOutputOption);
    }
    /**
     * @return When `notebook_output_option` is Allowed, the AWS Key Management Service (KMS) encryption key ID used to encrypt the notebook cell output in the Amazon S3 bucket.
     * 
     */
    public Optional<String> s3KmsKeyId() {
        return Optional.ofNullable(this.s3KmsKeyId);
    }
    /**
     * @return When `notebook_output_option` is Allowed, the Amazon S3 bucket used to save the notebook cell output.
     * 
     */
    public Optional<String> s3OutputPath() {
        return Optional.ofNullable(this.s3OutputPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettingsSharingSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String notebookOutputOption;
        private @Nullable String s3KmsKeyId;
        private @Nullable String s3OutputPath;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileUserSettingsSharingSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notebookOutputOption = defaults.notebookOutputOption;
    	      this.s3KmsKeyId = defaults.s3KmsKeyId;
    	      this.s3OutputPath = defaults.s3OutputPath;
        }

        public Builder notebookOutputOption(@Nullable String notebookOutputOption) {
            this.notebookOutputOption = notebookOutputOption;
            return this;
        }
        public Builder s3KmsKeyId(@Nullable String s3KmsKeyId) {
            this.s3KmsKeyId = s3KmsKeyId;
            return this;
        }
        public Builder s3OutputPath(@Nullable String s3OutputPath) {
            this.s3OutputPath = s3OutputPath;
            return this;
        }        public UserProfileUserSettingsSharingSettings build() {
            return new UserProfileUserSettingsSharingSettings(notebookOutputOption, s3KmsKeyId, s3OutputPath);
        }
    }
}