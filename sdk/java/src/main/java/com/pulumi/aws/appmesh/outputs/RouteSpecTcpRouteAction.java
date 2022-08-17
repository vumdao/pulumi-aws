// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.RouteSpecTcpRouteActionWeightedTarget;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RouteSpecTcpRouteAction {
    /**
     * @return The targets that traffic is routed to when a request matches the route.
     * You can specify one or more targets and their relative weights with which to distribute traffic.
     * 
     */
    private final List<RouteSpecTcpRouteActionWeightedTarget> weightedTargets;

    @CustomType.Constructor
    private RouteSpecTcpRouteAction(@CustomType.Parameter("weightedTargets") List<RouteSpecTcpRouteActionWeightedTarget> weightedTargets) {
        this.weightedTargets = weightedTargets;
    }

    /**
     * @return The targets that traffic is routed to when a request matches the route.
     * You can specify one or more targets and their relative weights with which to distribute traffic.
     * 
     */
    public List<RouteSpecTcpRouteActionWeightedTarget> weightedTargets() {
        return this.weightedTargets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecTcpRouteAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RouteSpecTcpRouteActionWeightedTarget> weightedTargets;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecTcpRouteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.weightedTargets = defaults.weightedTargets;
        }

        public Builder weightedTargets(List<RouteSpecTcpRouteActionWeightedTarget> weightedTargets) {
            this.weightedTargets = Objects.requireNonNull(weightedTargets);
            return this;
        }
        public Builder weightedTargets(RouteSpecTcpRouteActionWeightedTarget... weightedTargets) {
            return weightedTargets(List.of(weightedTargets));
        }        public RouteSpecTcpRouteAction build() {
            return new RouteSpecTcpRouteAction(weightedTargets);
        }
    }
}