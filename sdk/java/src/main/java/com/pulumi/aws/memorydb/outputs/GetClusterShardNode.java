// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.memorydb.outputs;

import com.pulumi.aws.memorydb.outputs.GetClusterShardNodeEndpoint;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterShardNode {
    /**
     * @return The Availability Zone in which the node resides.
     * 
     */
    private final String availabilityZone;
    /**
     * @return The date and time when the node was created. Example: `2022-01-01T21:00:00Z`.
     * 
     */
    private final String createTime;
    private final List<GetClusterShardNodeEndpoint> endpoints;
    /**
     * @return Name of the cluster.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetClusterShardNode(
        @CustomType.Parameter("availabilityZone") String availabilityZone,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("endpoints") List<GetClusterShardNodeEndpoint> endpoints,
        @CustomType.Parameter("name") String name) {
        this.availabilityZone = availabilityZone;
        this.createTime = createTime;
        this.endpoints = endpoints;
        this.name = name;
    }

    /**
     * @return The Availability Zone in which the node resides.
     * 
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * @return The date and time when the node was created. Example: `2022-01-01T21:00:00Z`.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    public List<GetClusterShardNodeEndpoint> endpoints() {
        return this.endpoints;
    }
    /**
     * @return Name of the cluster.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterShardNode defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availabilityZone;
        private String createTime;
        private List<GetClusterShardNodeEndpoint> endpoints;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterShardNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.createTime = defaults.createTime;
    	      this.endpoints = defaults.endpoints;
    	      this.name = defaults.name;
        }

        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder endpoints(List<GetClusterShardNodeEndpoint> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }
        public Builder endpoints(GetClusterShardNodeEndpoint... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetClusterShardNode build() {
            return new GetClusterShardNode(availabilityZone, createTime, endpoints, name);
        }
    }
}