// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.inputs;

import com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionAndCostCategoryArgs;
import com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionAndDimensionArgs;
import com.pulumi.aws.costexplorer.inputs.AnomalySubscriptionThresholdExpressionAndTagsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnomalySubscriptionThresholdExpressionAndArgs extends com.pulumi.resources.ResourceArgs {

    public static final AnomalySubscriptionThresholdExpressionAndArgs Empty = new AnomalySubscriptionThresholdExpressionAndArgs();

    @Import(name="costCategory")
    private @Nullable Output<AnomalySubscriptionThresholdExpressionAndCostCategoryArgs> costCategory;

    public Optional<Output<AnomalySubscriptionThresholdExpressionAndCostCategoryArgs>> costCategory() {
        return Optional.ofNullable(this.costCategory);
    }

    @Import(name="dimension")
    private @Nullable Output<AnomalySubscriptionThresholdExpressionAndDimensionArgs> dimension;

    public Optional<Output<AnomalySubscriptionThresholdExpressionAndDimensionArgs>> dimension() {
        return Optional.ofNullable(this.dimension);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<AnomalySubscriptionThresholdExpressionAndTagsArgs> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<AnomalySubscriptionThresholdExpressionAndTagsArgs>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AnomalySubscriptionThresholdExpressionAndArgs() {}

    private AnomalySubscriptionThresholdExpressionAndArgs(AnomalySubscriptionThresholdExpressionAndArgs $) {
        this.costCategory = $.costCategory;
        this.dimension = $.dimension;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnomalySubscriptionThresholdExpressionAndArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnomalySubscriptionThresholdExpressionAndArgs $;

        public Builder() {
            $ = new AnomalySubscriptionThresholdExpressionAndArgs();
        }

        public Builder(AnomalySubscriptionThresholdExpressionAndArgs defaults) {
            $ = new AnomalySubscriptionThresholdExpressionAndArgs(Objects.requireNonNull(defaults));
        }

        public Builder costCategory(@Nullable Output<AnomalySubscriptionThresholdExpressionAndCostCategoryArgs> costCategory) {
            $.costCategory = costCategory;
            return this;
        }

        public Builder costCategory(AnomalySubscriptionThresholdExpressionAndCostCategoryArgs costCategory) {
            return costCategory(Output.of(costCategory));
        }

        public Builder dimension(@Nullable Output<AnomalySubscriptionThresholdExpressionAndDimensionArgs> dimension) {
            $.dimension = dimension;
            return this;
        }

        public Builder dimension(AnomalySubscriptionThresholdExpressionAndDimensionArgs dimension) {
            return dimension(Output.of(dimension));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<AnomalySubscriptionThresholdExpressionAndTagsArgs> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(AnomalySubscriptionThresholdExpressionAndTagsArgs tags) {
            return tags(Output.of(tags));
        }

        public AnomalySubscriptionThresholdExpressionAndArgs build() {
            return $;
        }
    }

}
