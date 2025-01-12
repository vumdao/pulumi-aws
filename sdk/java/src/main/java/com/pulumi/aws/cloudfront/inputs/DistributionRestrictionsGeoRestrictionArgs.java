// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DistributionRestrictionsGeoRestrictionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DistributionRestrictionsGeoRestrictionArgs Empty = new DistributionRestrictionsGeoRestrictionArgs();

    @Import(name="locations")
    private @Nullable Output<List<String>> locations;

    public Optional<Output<List<String>>> locations() {
        return Optional.ofNullable(this.locations);
    }

    @Import(name="restrictionType", required=true)
    private Output<String> restrictionType;

    public Output<String> restrictionType() {
        return this.restrictionType;
    }

    private DistributionRestrictionsGeoRestrictionArgs() {}

    private DistributionRestrictionsGeoRestrictionArgs(DistributionRestrictionsGeoRestrictionArgs $) {
        this.locations = $.locations;
        this.restrictionType = $.restrictionType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DistributionRestrictionsGeoRestrictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DistributionRestrictionsGeoRestrictionArgs $;

        public Builder() {
            $ = new DistributionRestrictionsGeoRestrictionArgs();
        }

        public Builder(DistributionRestrictionsGeoRestrictionArgs defaults) {
            $ = new DistributionRestrictionsGeoRestrictionArgs(Objects.requireNonNull(defaults));
        }

        public Builder locations(@Nullable Output<List<String>> locations) {
            $.locations = locations;
            return this;
        }

        public Builder locations(List<String> locations) {
            return locations(Output.of(locations));
        }

        public Builder locations(String... locations) {
            return locations(List.of(locations));
        }

        public Builder restrictionType(Output<String> restrictionType) {
            $.restrictionType = restrictionType;
            return this;
        }

        public Builder restrictionType(String restrictionType) {
            return restrictionType(Output.of(restrictionType));
        }

        public DistributionRestrictionsGeoRestrictionArgs build() {
            if ($.restrictionType == null) {
                throw new MissingRequiredPropertyException("DistributionRestrictionsGeoRestrictionArgs", "restrictionType");
            }
            return $;
        }
    }

}
