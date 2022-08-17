// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.aws.glue.outputs.GetConnectionPhysicalConnectionRequirement;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetConnectionResult {
    /**
     * @return The ARN of the Glue Connection.
     * 
     */
    private final String arn;
    /**
     * @return The catalog ID of the Glue Connection.
     * 
     */
    private final String catalogId;
    private final Map<String,String> connectionProperties;
    /**
     * @return The type of Glue Connection.
     * 
     */
    private final String connectionType;
    /**
     * @return Description of the connection.
     * 
     */
    private final String description;
    private final String id;
    /**
     * @return A list of criteria that can be used in selecting this connection.
     * 
     */
    private final List<String> matchCriterias;
    /**
     * @return The name of the Glue Connection.
     * 
     */
    private final String name;
    /**
     * @return A map of physical connection requirements, such as VPC and SecurityGroup.
     * 
     */
    private final List<GetConnectionPhysicalConnectionRequirement> physicalConnectionRequirements;
    /**
     * @return The tags assigned to the resource
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetConnectionResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("catalogId") String catalogId,
        @CustomType.Parameter("connectionProperties") Map<String,String> connectionProperties,
        @CustomType.Parameter("connectionType") String connectionType,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("matchCriterias") List<String> matchCriterias,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("physicalConnectionRequirements") List<GetConnectionPhysicalConnectionRequirement> physicalConnectionRequirements,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.catalogId = catalogId;
        this.connectionProperties = connectionProperties;
        this.connectionType = connectionType;
        this.description = description;
        this.id = id;
        this.matchCriterias = matchCriterias;
        this.name = name;
        this.physicalConnectionRequirements = physicalConnectionRequirements;
        this.tags = tags;
    }

    /**
     * @return The ARN of the Glue Connection.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The catalog ID of the Glue Connection.
     * 
     */
    public String catalogId() {
        return this.catalogId;
    }
    public Map<String,String> connectionProperties() {
        return this.connectionProperties;
    }
    /**
     * @return The type of Glue Connection.
     * 
     */
    public String connectionType() {
        return this.connectionType;
    }
    /**
     * @return Description of the connection.
     * 
     */
    public String description() {
        return this.description;
    }
    public String id() {
        return this.id;
    }
    /**
     * @return A list of criteria that can be used in selecting this connection.
     * 
     */
    public List<String> matchCriterias() {
        return this.matchCriterias;
    }
    /**
     * @return The name of the Glue Connection.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return A map of physical connection requirements, such as VPC and SecurityGroup.
     * 
     */
    public List<GetConnectionPhysicalConnectionRequirement> physicalConnectionRequirements() {
        return this.physicalConnectionRequirements;
    }
    /**
     * @return The tags assigned to the resource
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String catalogId;
        private Map<String,String> connectionProperties;
        private String connectionType;
        private String description;
        private String id;
        private List<String> matchCriterias;
        private String name;
        private List<GetConnectionPhysicalConnectionRequirement> physicalConnectionRequirements;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.catalogId = defaults.catalogId;
    	      this.connectionProperties = defaults.connectionProperties;
    	      this.connectionType = defaults.connectionType;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.matchCriterias = defaults.matchCriterias;
    	      this.name = defaults.name;
    	      this.physicalConnectionRequirements = defaults.physicalConnectionRequirements;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder catalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }
        public Builder connectionProperties(Map<String,String> connectionProperties) {
            this.connectionProperties = Objects.requireNonNull(connectionProperties);
            return this;
        }
        public Builder connectionType(String connectionType) {
            this.connectionType = Objects.requireNonNull(connectionType);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder matchCriterias(List<String> matchCriterias) {
            this.matchCriterias = Objects.requireNonNull(matchCriterias);
            return this;
        }
        public Builder matchCriterias(String... matchCriterias) {
            return matchCriterias(List.of(matchCriterias));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder physicalConnectionRequirements(List<GetConnectionPhysicalConnectionRequirement> physicalConnectionRequirements) {
            this.physicalConnectionRequirements = Objects.requireNonNull(physicalConnectionRequirements);
            return this;
        }
        public Builder physicalConnectionRequirements(GetConnectionPhysicalConnectionRequirement... physicalConnectionRequirements) {
            return physicalConnectionRequirements(List.of(physicalConnectionRequirements));
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetConnectionResult build() {
            return new GetConnectionResult(arn, catalogId, connectionProperties, connectionType, description, id, matchCriterias, name, physicalConnectionRequirements, tags);
        }
    }
}