// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Manages a FSx ONTAP Volume.
 * See the [FSx ONTAP User Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html) for more information.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.fsx.OntapVolume("test", {
 *     junctionPath: "/test",
 *     sizeInMegabytes: 1024,
 *     storageEfficiencyEnabled: true,
 *     storageVirtualMachineId: aws_fsx_ontap_storage_virtual_machine.test.id,
 * });
 * ```
 * ### Using Tiering Policy
 *
 * Additional information on tiering policy with ONTAP Volumes can be found in the [FSx ONTAP Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-volumes.html).
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = new aws.fsx.OntapVolume("test", {
 *     junctionPath: "/test",
 *     sizeInMegabytes: 1024,
 *     storageEfficiencyEnabled: true,
 *     storageVirtualMachineId: aws_fsx_ontap_storage_virtual_machine.test.id,
 *     tieringPolicy: {
 *         name: "AUTO",
 *         coolingPeriod: 31,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * FSx ONTAP volume can be imported using the `id`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:fsx/ontapVolume:OntapVolume example fsvol-12345678abcdef123
 * ```
 */
export class OntapVolume extends pulumi.CustomResource {
    /**
     * Get an existing OntapVolume resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OntapVolumeState, opts?: pulumi.CustomResourceOptions): OntapVolume {
        return new OntapVolume(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:fsx/ontapVolume:OntapVolume';

    /**
     * Returns true if the given object is an instance of OntapVolume.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OntapVolume {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OntapVolume.__pulumiType;
    }

    /**
     * Amazon Resource Name of the volune.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Describes the file system for the volume, e.g. `fs-12345679`
     */
    public /*out*/ readonly fileSystemId!: pulumi.Output<string>;
    /**
     * Specifies the FlexCache endpoint type of the volume, Valid values are `NONE`, `ORIGIN`, `CACHE`. Default value is `NONE`. These can be set by the ONTAP CLI or API and are use with FlexCache feature.
     */
    public /*out*/ readonly flexcacheEndpointType!: pulumi.Output<string>;
    /**
     * Specifies the location in the storage virtual machine's namespace where the volume is mounted. The junctionPath must have a leading forward slash, such as `/vol3`
     */
    public readonly junctionPath!: pulumi.Output<string>;
    /**
     * Specifies the tiering policy for the ONTAP volume for moving data to the capacity pool storage. Valid values are `SNAPSHOT_ONLY`, `AUTO`, `ALL`, `NONE`. Default value is `SNAPSHOT_ONLY`.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the type of volume, Valid values are `RW`, `DP`,  and `LS`. Default value is `RW`. These can be set by the ONTAP CLI or API. This setting is used as part of migration and replication [Migrating to Amazon FSx for NetApp ONTAP](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/migrating-fsx-ontap.html)
     */
    public /*out*/ readonly ontapVolumeType!: pulumi.Output<string>;
    /**
     * Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. Default value is `UNIX`.
     */
    public readonly securityStyle!: pulumi.Output<string | undefined>;
    /**
     * Specifies the size of the volume, in megabytes (MB), that you are creating.
     */
    public readonly sizeInMegabytes!: pulumi.Output<number>;
    /**
     * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
     */
    public readonly storageEfficiencyEnabled!: pulumi.Output<boolean>;
    /**
     * Specifies the storage virtual machine in which to create the volume.
     */
    public readonly storageVirtualMachineId!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the volume. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    public readonly tieringPolicy!: pulumi.Output<outputs.fsx.OntapVolumeTieringPolicy | undefined>;
    /**
     * The Volume's UUID (universally unique identifier).
     */
    public /*out*/ readonly uuid!: pulumi.Output<string>;
    /**
     * The type of volume, currently the only valid value is `ONTAP`.
     */
    public readonly volumeType!: pulumi.Output<string | undefined>;

    /**
     * Create a OntapVolume resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OntapVolumeArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OntapVolumeArgs | OntapVolumeState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OntapVolumeState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["fileSystemId"] = state ? state.fileSystemId : undefined;
            resourceInputs["flexcacheEndpointType"] = state ? state.flexcacheEndpointType : undefined;
            resourceInputs["junctionPath"] = state ? state.junctionPath : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ontapVolumeType"] = state ? state.ontapVolumeType : undefined;
            resourceInputs["securityStyle"] = state ? state.securityStyle : undefined;
            resourceInputs["sizeInMegabytes"] = state ? state.sizeInMegabytes : undefined;
            resourceInputs["storageEfficiencyEnabled"] = state ? state.storageEfficiencyEnabled : undefined;
            resourceInputs["storageVirtualMachineId"] = state ? state.storageVirtualMachineId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["tieringPolicy"] = state ? state.tieringPolicy : undefined;
            resourceInputs["uuid"] = state ? state.uuid : undefined;
            resourceInputs["volumeType"] = state ? state.volumeType : undefined;
        } else {
            const args = argsOrState as OntapVolumeArgs | undefined;
            if ((!args || args.junctionPath === undefined) && !opts.urn) {
                throw new Error("Missing required property 'junctionPath'");
            }
            if ((!args || args.sizeInMegabytes === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sizeInMegabytes'");
            }
            if ((!args || args.storageEfficiencyEnabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageEfficiencyEnabled'");
            }
            if ((!args || args.storageVirtualMachineId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'storageVirtualMachineId'");
            }
            resourceInputs["junctionPath"] = args ? args.junctionPath : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["securityStyle"] = args ? args.securityStyle : undefined;
            resourceInputs["sizeInMegabytes"] = args ? args.sizeInMegabytes : undefined;
            resourceInputs["storageEfficiencyEnabled"] = args ? args.storageEfficiencyEnabled : undefined;
            resourceInputs["storageVirtualMachineId"] = args ? args.storageVirtualMachineId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["tieringPolicy"] = args ? args.tieringPolicy : undefined;
            resourceInputs["volumeType"] = args ? args.volumeType : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["fileSystemId"] = undefined /*out*/;
            resourceInputs["flexcacheEndpointType"] = undefined /*out*/;
            resourceInputs["ontapVolumeType"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["uuid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OntapVolume.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OntapVolume resources.
 */
export interface OntapVolumeState {
    /**
     * Amazon Resource Name of the volune.
     */
    arn?: pulumi.Input<string>;
    /**
     * Describes the file system for the volume, e.g. `fs-12345679`
     */
    fileSystemId?: pulumi.Input<string>;
    /**
     * Specifies the FlexCache endpoint type of the volume, Valid values are `NONE`, `ORIGIN`, `CACHE`. Default value is `NONE`. These can be set by the ONTAP CLI or API and are use with FlexCache feature.
     */
    flexcacheEndpointType?: pulumi.Input<string>;
    /**
     * Specifies the location in the storage virtual machine's namespace where the volume is mounted. The junctionPath must have a leading forward slash, such as `/vol3`
     */
    junctionPath?: pulumi.Input<string>;
    /**
     * Specifies the tiering policy for the ONTAP volume for moving data to the capacity pool storage. Valid values are `SNAPSHOT_ONLY`, `AUTO`, `ALL`, `NONE`. Default value is `SNAPSHOT_ONLY`.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the type of volume, Valid values are `RW`, `DP`,  and `LS`. Default value is `RW`. These can be set by the ONTAP CLI or API. This setting is used as part of migration and replication [Migrating to Amazon FSx for NetApp ONTAP](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/migrating-fsx-ontap.html)
     */
    ontapVolumeType?: pulumi.Input<string>;
    /**
     * Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. Default value is `UNIX`.
     */
    securityStyle?: pulumi.Input<string>;
    /**
     * Specifies the size of the volume, in megabytes (MB), that you are creating.
     */
    sizeInMegabytes?: pulumi.Input<number>;
    /**
     * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
     */
    storageEfficiencyEnabled?: pulumi.Input<boolean>;
    /**
     * Specifies the storage virtual machine in which to create the volume.
     */
    storageVirtualMachineId?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the volume. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    tieringPolicy?: pulumi.Input<inputs.fsx.OntapVolumeTieringPolicy>;
    /**
     * The Volume's UUID (universally unique identifier).
     */
    uuid?: pulumi.Input<string>;
    /**
     * The type of volume, currently the only valid value is `ONTAP`.
     */
    volumeType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OntapVolume resource.
 */
export interface OntapVolumeArgs {
    /**
     * Specifies the location in the storage virtual machine's namespace where the volume is mounted. The junctionPath must have a leading forward slash, such as `/vol3`
     */
    junctionPath: pulumi.Input<string>;
    /**
     * Specifies the tiering policy for the ONTAP volume for moving data to the capacity pool storage. Valid values are `SNAPSHOT_ONLY`, `AUTO`, `ALL`, `NONE`. Default value is `SNAPSHOT_ONLY`.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. Default value is `UNIX`.
     */
    securityStyle?: pulumi.Input<string>;
    /**
     * Specifies the size of the volume, in megabytes (MB), that you are creating.
     */
    sizeInMegabytes: pulumi.Input<number>;
    /**
     * Set to true to enable deduplication, compression, and compaction storage efficiency features on the volume.
     */
    storageEfficiencyEnabled: pulumi.Input<boolean>;
    /**
     * Specifies the storage virtual machine in which to create the volume.
     */
    storageVirtualMachineId: pulumi.Input<string>;
    /**
     * A map of tags to assign to the volume. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    tieringPolicy?: pulumi.Input<inputs.fsx.OntapVolumeTieringPolicy>;
    /**
     * The type of volume, currently the only valid value is `ONTAP`.
     */
    volumeType?: pulumi.Input<string>;
}