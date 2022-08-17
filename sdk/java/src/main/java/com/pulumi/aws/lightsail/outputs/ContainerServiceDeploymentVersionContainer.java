// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lightsail.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ContainerServiceDeploymentVersionContainer {
    /**
     * @return The launch command for the container. A list of string.
     * 
     */
    private final @Nullable List<String> commands;
    /**
     * @return The name for the container.
     * 
     */
    private final String containerName;
    /**
     * @return A key-value map of the environment variables of the container.
     * 
     */
    private final @Nullable Map<String,String> environment;
    /**
     * @return The name of the image used for the container. Container images sourced from your Lightsail container service, that are registered and stored on your service, start with a colon (`:`). For example, `:container-service-1.mystaticwebsite.1`. Container images sourced from a public registry like Docker Hub don&#39;t start with a colon. For example, `nginx:latest` or `nginx`.
     * 
     */
    private final String image;
    /**
     * @return A key-value map of the open firewall ports of the container. Valid values: `HTTP`, `HTTPS`, `TCP`, `UDP`.
     * 
     */
    private final @Nullable Map<String,String> ports;

    @CustomType.Constructor
    private ContainerServiceDeploymentVersionContainer(
        @CustomType.Parameter("commands") @Nullable List<String> commands,
        @CustomType.Parameter("containerName") String containerName,
        @CustomType.Parameter("environment") @Nullable Map<String,String> environment,
        @CustomType.Parameter("image") String image,
        @CustomType.Parameter("ports") @Nullable Map<String,String> ports) {
        this.commands = commands;
        this.containerName = containerName;
        this.environment = environment;
        this.image = image;
        this.ports = ports;
    }

    /**
     * @return The launch command for the container. A list of string.
     * 
     */
    public List<String> commands() {
        return this.commands == null ? List.of() : this.commands;
    }
    /**
     * @return The name for the container.
     * 
     */
    public String containerName() {
        return this.containerName;
    }
    /**
     * @return A key-value map of the environment variables of the container.
     * 
     */
    public Map<String,String> environment() {
        return this.environment == null ? Map.of() : this.environment;
    }
    /**
     * @return The name of the image used for the container. Container images sourced from your Lightsail container service, that are registered and stored on your service, start with a colon (`:`). For example, `:container-service-1.mystaticwebsite.1`. Container images sourced from a public registry like Docker Hub don&#39;t start with a colon. For example, `nginx:latest` or `nginx`.
     * 
     */
    public String image() {
        return this.image;
    }
    /**
     * @return A key-value map of the open firewall ports of the container. Valid values: `HTTP`, `HTTPS`, `TCP`, `UDP`.
     * 
     */
    public Map<String,String> ports() {
        return this.ports == null ? Map.of() : this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerServiceDeploymentVersionContainer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> commands;
        private String containerName;
        private @Nullable Map<String,String> environment;
        private String image;
        private @Nullable Map<String,String> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerServiceDeploymentVersionContainer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commands = defaults.commands;
    	      this.containerName = defaults.containerName;
    	      this.environment = defaults.environment;
    	      this.image = defaults.image;
    	      this.ports = defaults.ports;
        }

        public Builder commands(@Nullable List<String> commands) {
            this.commands = commands;
            return this;
        }
        public Builder commands(String... commands) {
            return commands(List.of(commands));
        }
        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder environment(@Nullable Map<String,String> environment) {
            this.environment = environment;
            return this;
        }
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder ports(@Nullable Map<String,String> ports) {
            this.ports = ports;
            return this;
        }        public ContainerServiceDeploymentVersionContainer build() {
            return new ContainerServiceDeploymentVersionContainer(commands, containerName, environment, image, ports);
        }
    }
}