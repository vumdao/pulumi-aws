// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.outputs;

import com.pulumi.aws.macie2.outputs.ClassificationJobS3JobDefinitionBucketCriteriaIncludesAnd;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ClassificationJobS3JobDefinitionBucketCriteriaIncludes {
    /**
     * @return An array of conditions, one for each condition that determines which S3 buckets to include or exclude from the job. (documented below)
     * 
     */
    private final @Nullable List<ClassificationJobS3JobDefinitionBucketCriteriaIncludesAnd> ands;

    @CustomType.Constructor
    private ClassificationJobS3JobDefinitionBucketCriteriaIncludes(@CustomType.Parameter("ands") @Nullable List<ClassificationJobS3JobDefinitionBucketCriteriaIncludesAnd> ands) {
        this.ands = ands;
    }

    /**
     * @return An array of conditions, one for each condition that determines which S3 buckets to include or exclude from the job. (documented below)
     * 
     */
    public List<ClassificationJobS3JobDefinitionBucketCriteriaIncludesAnd> ands() {
        return this.ands == null ? List.of() : this.ands;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClassificationJobS3JobDefinitionBucketCriteriaIncludes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ClassificationJobS3JobDefinitionBucketCriteriaIncludesAnd> ands;

        public Builder() {
    	      // Empty
        }

        public Builder(ClassificationJobS3JobDefinitionBucketCriteriaIncludes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ands = defaults.ands;
        }

        public Builder ands(@Nullable List<ClassificationJobS3JobDefinitionBucketCriteriaIncludesAnd> ands) {
            this.ands = ands;
            return this;
        }
        public Builder ands(ClassificationJobS3JobDefinitionBucketCriteriaIncludesAnd... ands) {
            return ands(List.of(ands));
        }        public ClassificationJobS3JobDefinitionBucketCriteriaIncludes build() {
            return new ClassificationJobS3JobDefinitionBucketCriteriaIncludes(ands);
        }
    }
}