// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.inputs;

import com.pulumi.aws.securityhub.inputs.InsightFiltersLastObservedAtDateRangeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InsightFiltersLastObservedAtArgs extends com.pulumi.resources.ResourceArgs {

    public static final InsightFiltersLastObservedAtArgs Empty = new InsightFiltersLastObservedAtArgs();

    @Import(name="dateRange")
    private @Nullable Output<InsightFiltersLastObservedAtDateRangeArgs> dateRange;

    public Optional<Output<InsightFiltersLastObservedAtDateRangeArgs>> dateRange() {
        return Optional.ofNullable(this.dateRange);
    }

    @Import(name="end")
    private @Nullable Output<String> end;

    public Optional<Output<String>> end() {
        return Optional.ofNullable(this.end);
    }

    @Import(name="start")
    private @Nullable Output<String> start;

    public Optional<Output<String>> start() {
        return Optional.ofNullable(this.start);
    }

    private InsightFiltersLastObservedAtArgs() {}

    private InsightFiltersLastObservedAtArgs(InsightFiltersLastObservedAtArgs $) {
        this.dateRange = $.dateRange;
        this.end = $.end;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InsightFiltersLastObservedAtArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InsightFiltersLastObservedAtArgs $;

        public Builder() {
            $ = new InsightFiltersLastObservedAtArgs();
        }

        public Builder(InsightFiltersLastObservedAtArgs defaults) {
            $ = new InsightFiltersLastObservedAtArgs(Objects.requireNonNull(defaults));
        }

        public Builder dateRange(@Nullable Output<InsightFiltersLastObservedAtDateRangeArgs> dateRange) {
            $.dateRange = dateRange;
            return this;
        }

        public Builder dateRange(InsightFiltersLastObservedAtDateRangeArgs dateRange) {
            return dateRange(Output.of(dateRange));
        }

        public Builder end(@Nullable Output<String> end) {
            $.end = end;
            return this;
        }

        public Builder end(String end) {
            return end(Output.of(end));
        }

        public Builder start(@Nullable Output<String> start) {
            $.start = start;
            return this;
        }

        public Builder start(String start) {
            return start(Output.of(start));
        }

        public InsightFiltersLastObservedAtArgs build() {
            return $;
        }
    }

}
