// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLaunchConfigurationEbsBlockDevice {
    /**
     * @return Whether the EBS Volume will be deleted on instance termination.
     * 
     */
    private Boolean deleteOnTermination;
    /**
     * @return Name of the device.
     * 
     */
    private String deviceName;
    /**
     * @return Whether the volume is Encrypted.
     * 
     */
    private Boolean encrypted;
    /**
     * @return Provisioned IOPs of the volume.
     * 
     */
    private Integer iops;
    /**
     * @return Whether the device in the block device mapping of the AMI is suppressed.
     * 
     */
    private Boolean noDevice;
    /**
     * @return Snapshot ID of the mount.
     * 
     */
    private String snapshotId;
    /**
     * @return Throughput of the volume.
     * 
     */
    private Integer throughput;
    /**
     * @return Size of the volume.
     * 
     */
    private Integer volumeSize;
    /**
     * @return Type of the volume.
     * 
     */
    private String volumeType;

    private GetLaunchConfigurationEbsBlockDevice() {}
    /**
     * @return Whether the EBS Volume will be deleted on instance termination.
     * 
     */
    public Boolean deleteOnTermination() {
        return this.deleteOnTermination;
    }
    /**
     * @return Name of the device.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return Whether the volume is Encrypted.
     * 
     */
    public Boolean encrypted() {
        return this.encrypted;
    }
    /**
     * @return Provisioned IOPs of the volume.
     * 
     */
    public Integer iops() {
        return this.iops;
    }
    /**
     * @return Whether the device in the block device mapping of the AMI is suppressed.
     * 
     */
    public Boolean noDevice() {
        return this.noDevice;
    }
    /**
     * @return Snapshot ID of the mount.
     * 
     */
    public String snapshotId() {
        return this.snapshotId;
    }
    /**
     * @return Throughput of the volume.
     * 
     */
    public Integer throughput() {
        return this.throughput;
    }
    /**
     * @return Size of the volume.
     * 
     */
    public Integer volumeSize() {
        return this.volumeSize;
    }
    /**
     * @return Type of the volume.
     * 
     */
    public String volumeType() {
        return this.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchConfigurationEbsBlockDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean deleteOnTermination;
        private String deviceName;
        private Boolean encrypted;
        private Integer iops;
        private Boolean noDevice;
        private String snapshotId;
        private Integer throughput;
        private Integer volumeSize;
        private String volumeType;
        public Builder() {}
        public Builder(GetLaunchConfigurationEbsBlockDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceName = defaults.deviceName;
    	      this.encrypted = defaults.encrypted;
    	      this.iops = defaults.iops;
    	      this.noDevice = defaults.noDevice;
    	      this.snapshotId = defaults.snapshotId;
    	      this.throughput = defaults.throughput;
    	      this.volumeSize = defaults.volumeSize;
    	      this.volumeType = defaults.volumeType;
        }

        @CustomType.Setter
        public Builder deleteOnTermination(Boolean deleteOnTermination) {
            if (deleteOnTermination == null) {
              throw new MissingRequiredPropertyException("GetLaunchConfigurationEbsBlockDevice", "deleteOnTermination");
            }
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }
        @CustomType.Setter
        public Builder deviceName(String deviceName) {
            if (deviceName == null) {
              throw new MissingRequiredPropertyException("GetLaunchConfigurationEbsBlockDevice", "deviceName");
            }
            this.deviceName = deviceName;
            return this;
        }
        @CustomType.Setter
        public Builder encrypted(Boolean encrypted) {
            if (encrypted == null) {
              throw new MissingRequiredPropertyException("GetLaunchConfigurationEbsBlockDevice", "encrypted");
            }
            this.encrypted = encrypted;
            return this;
        }
        @CustomType.Setter
        public Builder iops(Integer iops) {
            if (iops == null) {
              throw new MissingRequiredPropertyException("GetLaunchConfigurationEbsBlockDevice", "iops");
            }
            this.iops = iops;
            return this;
        }
        @CustomType.Setter
        public Builder noDevice(Boolean noDevice) {
            if (noDevice == null) {
              throw new MissingRequiredPropertyException("GetLaunchConfigurationEbsBlockDevice", "noDevice");
            }
            this.noDevice = noDevice;
            return this;
        }
        @CustomType.Setter
        public Builder snapshotId(String snapshotId) {
            if (snapshotId == null) {
              throw new MissingRequiredPropertyException("GetLaunchConfigurationEbsBlockDevice", "snapshotId");
            }
            this.snapshotId = snapshotId;
            return this;
        }
        @CustomType.Setter
        public Builder throughput(Integer throughput) {
            if (throughput == null) {
              throw new MissingRequiredPropertyException("GetLaunchConfigurationEbsBlockDevice", "throughput");
            }
            this.throughput = throughput;
            return this;
        }
        @CustomType.Setter
        public Builder volumeSize(Integer volumeSize) {
            if (volumeSize == null) {
              throw new MissingRequiredPropertyException("GetLaunchConfigurationEbsBlockDevice", "volumeSize");
            }
            this.volumeSize = volumeSize;
            return this;
        }
        @CustomType.Setter
        public Builder volumeType(String volumeType) {
            if (volumeType == null) {
              throw new MissingRequiredPropertyException("GetLaunchConfigurationEbsBlockDevice", "volumeType");
            }
            this.volumeType = volumeType;
            return this;
        }
        public GetLaunchConfigurationEbsBlockDevice build() {
            final var _resultValue = new GetLaunchConfigurationEbsBlockDevice();
            _resultValue.deleteOnTermination = deleteOnTermination;
            _resultValue.deviceName = deviceName;
            _resultValue.encrypted = encrypted;
            _resultValue.iops = iops;
            _resultValue.noDevice = noDevice;
            _resultValue.snapshotId = snapshotId;
            _resultValue.throughput = throughput;
            _resultValue.volumeSize = volumeSize;
            _resultValue.volumeType = volumeType;
            return _resultValue;
        }
    }
}
