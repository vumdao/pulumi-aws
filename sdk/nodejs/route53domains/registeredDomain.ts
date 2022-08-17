// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.route53domains.RegisteredDomain("example", {
 *     domainName: "example.com",
 *     nameServers: [
 *         {
 *             name: "ns-195.awsdns-24.com",
 *         },
 *         {
 *             name: "ns-874.awsdns-45.net",
 *         },
 *     ],
 *     tags: {
 *         Environment: "test",
 *     },
 * });
 * ```
 */
export class RegisteredDomain extends pulumi.CustomResource {
    /**
     * Get an existing RegisteredDomain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RegisteredDomainState, opts?: pulumi.CustomResourceOptions): RegisteredDomain {
        return new RegisteredDomain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:route53domains/registeredDomain:RegisteredDomain';

    /**
     * Returns true if the given object is an instance of RegisteredDomain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RegisteredDomain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RegisteredDomain.__pulumiType;
    }

    /**
     * Email address to contact to report incorrect contact information for a domain, to report that the domain is being used to send spam, to report that someone is cybersquatting on a domain name, or report some other type of abuse.
     */
    public /*out*/ readonly abuseContactEmail!: pulumi.Output<string>;
    /**
     * Phone number for reporting abuse.
     */
    public /*out*/ readonly abuseContactPhone!: pulumi.Output<string>;
    /**
     * Details about the domain administrative contact.
     */
    public readonly adminContact!: pulumi.Output<outputs.route53domains.RegisteredDomainAdminContact>;
    /**
     * Whether domain administrative contact information is concealed from WHOIS queries. Default: `true`.
     */
    public readonly adminPrivacy!: pulumi.Output<boolean | undefined>;
    /**
     * Whether the domain registration is set to renew automatically. Default: `true`.
     */
    public readonly autoRenew!: pulumi.Output<boolean | undefined>;
    /**
     * The date when the domain was created as found in the response to a WHOIS query.
     */
    public /*out*/ readonly creationDate!: pulumi.Output<string>;
    /**
     * The name of the registered domain.
     */
    public readonly domainName!: pulumi.Output<string>;
    /**
     * The date when the registration for the domain is set to expire.
     */
    public /*out*/ readonly expirationDate!: pulumi.Output<string>;
    /**
     * The list of nameservers for the domain.
     */
    public readonly nameServers!: pulumi.Output<outputs.route53domains.RegisteredDomainNameServer[]>;
    /**
     * Details about the domain registrant.
     */
    public readonly registrantContact!: pulumi.Output<outputs.route53domains.RegisteredDomainRegistrantContact>;
    /**
     * Whether domain registrant contact information is concealed from WHOIS queries. Default: `true`.
     */
    public readonly registrantPrivacy!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the registrar of the domain as identified in the registry.
     */
    public /*out*/ readonly registrarName!: pulumi.Output<string>;
    /**
     * Web address of the registrar.
     */
    public /*out*/ readonly registrarUrl!: pulumi.Output<string>;
    /**
     * Reseller of the domain.
     */
    public /*out*/ readonly reseller!: pulumi.Output<string>;
    /**
     * List of [domain name status codes](https://www.icann.org/resources/pages/epp-status-codes-2014-06-16-en).
     */
    public /*out*/ readonly statusLists!: pulumi.Output<string[]>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    public readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Details about the domain technical contact.
     */
    public readonly techContact!: pulumi.Output<outputs.route53domains.RegisteredDomainTechContact>;
    /**
     * Whether domain technical contact information is concealed from WHOIS queries. Default: `true`.
     */
    public readonly techPrivacy!: pulumi.Output<boolean | undefined>;
    /**
     * Whether the domain is locked for transfer. Default: `true`.
     */
    public readonly transferLock!: pulumi.Output<boolean | undefined>;
    /**
     * The last updated date of the domain as found in the response to a WHOIS query.
     */
    public /*out*/ readonly updatedDate!: pulumi.Output<string>;
    /**
     * The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.
     */
    public /*out*/ readonly whoisServer!: pulumi.Output<string>;

    /**
     * Create a RegisteredDomain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RegisteredDomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RegisteredDomainArgs | RegisteredDomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RegisteredDomainState | undefined;
            resourceInputs["abuseContactEmail"] = state ? state.abuseContactEmail : undefined;
            resourceInputs["abuseContactPhone"] = state ? state.abuseContactPhone : undefined;
            resourceInputs["adminContact"] = state ? state.adminContact : undefined;
            resourceInputs["adminPrivacy"] = state ? state.adminPrivacy : undefined;
            resourceInputs["autoRenew"] = state ? state.autoRenew : undefined;
            resourceInputs["creationDate"] = state ? state.creationDate : undefined;
            resourceInputs["domainName"] = state ? state.domainName : undefined;
            resourceInputs["expirationDate"] = state ? state.expirationDate : undefined;
            resourceInputs["nameServers"] = state ? state.nameServers : undefined;
            resourceInputs["registrantContact"] = state ? state.registrantContact : undefined;
            resourceInputs["registrantPrivacy"] = state ? state.registrantPrivacy : undefined;
            resourceInputs["registrarName"] = state ? state.registrarName : undefined;
            resourceInputs["registrarUrl"] = state ? state.registrarUrl : undefined;
            resourceInputs["reseller"] = state ? state.reseller : undefined;
            resourceInputs["statusLists"] = state ? state.statusLists : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["techContact"] = state ? state.techContact : undefined;
            resourceInputs["techPrivacy"] = state ? state.techPrivacy : undefined;
            resourceInputs["transferLock"] = state ? state.transferLock : undefined;
            resourceInputs["updatedDate"] = state ? state.updatedDate : undefined;
            resourceInputs["whoisServer"] = state ? state.whoisServer : undefined;
        } else {
            const args = argsOrState as RegisteredDomainArgs | undefined;
            if ((!args || args.domainName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domainName'");
            }
            resourceInputs["adminContact"] = args ? args.adminContact : undefined;
            resourceInputs["adminPrivacy"] = args ? args.adminPrivacy : undefined;
            resourceInputs["autoRenew"] = args ? args.autoRenew : undefined;
            resourceInputs["domainName"] = args ? args.domainName : undefined;
            resourceInputs["nameServers"] = args ? args.nameServers : undefined;
            resourceInputs["registrantContact"] = args ? args.registrantContact : undefined;
            resourceInputs["registrantPrivacy"] = args ? args.registrantPrivacy : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["tagsAll"] = args ? args.tagsAll : undefined;
            resourceInputs["techContact"] = args ? args.techContact : undefined;
            resourceInputs["techPrivacy"] = args ? args.techPrivacy : undefined;
            resourceInputs["transferLock"] = args ? args.transferLock : undefined;
            resourceInputs["abuseContactEmail"] = undefined /*out*/;
            resourceInputs["abuseContactPhone"] = undefined /*out*/;
            resourceInputs["creationDate"] = undefined /*out*/;
            resourceInputs["expirationDate"] = undefined /*out*/;
            resourceInputs["registrarName"] = undefined /*out*/;
            resourceInputs["registrarUrl"] = undefined /*out*/;
            resourceInputs["reseller"] = undefined /*out*/;
            resourceInputs["statusLists"] = undefined /*out*/;
            resourceInputs["updatedDate"] = undefined /*out*/;
            resourceInputs["whoisServer"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RegisteredDomain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RegisteredDomain resources.
 */
export interface RegisteredDomainState {
    /**
     * Email address to contact to report incorrect contact information for a domain, to report that the domain is being used to send spam, to report that someone is cybersquatting on a domain name, or report some other type of abuse.
     */
    abuseContactEmail?: pulumi.Input<string>;
    /**
     * Phone number for reporting abuse.
     */
    abuseContactPhone?: pulumi.Input<string>;
    /**
     * Details about the domain administrative contact.
     */
    adminContact?: pulumi.Input<inputs.route53domains.RegisteredDomainAdminContact>;
    /**
     * Whether domain administrative contact information is concealed from WHOIS queries. Default: `true`.
     */
    adminPrivacy?: pulumi.Input<boolean>;
    /**
     * Whether the domain registration is set to renew automatically. Default: `true`.
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * The date when the domain was created as found in the response to a WHOIS query.
     */
    creationDate?: pulumi.Input<string>;
    /**
     * The name of the registered domain.
     */
    domainName?: pulumi.Input<string>;
    /**
     * The date when the registration for the domain is set to expire.
     */
    expirationDate?: pulumi.Input<string>;
    /**
     * The list of nameservers for the domain.
     */
    nameServers?: pulumi.Input<pulumi.Input<inputs.route53domains.RegisteredDomainNameServer>[]>;
    /**
     * Details about the domain registrant.
     */
    registrantContact?: pulumi.Input<inputs.route53domains.RegisteredDomainRegistrantContact>;
    /**
     * Whether domain registrant contact information is concealed from WHOIS queries. Default: `true`.
     */
    registrantPrivacy?: pulumi.Input<boolean>;
    /**
     * Name of the registrar of the domain as identified in the registry.
     */
    registrarName?: pulumi.Input<string>;
    /**
     * Web address of the registrar.
     */
    registrarUrl?: pulumi.Input<string>;
    /**
     * Reseller of the domain.
     */
    reseller?: pulumi.Input<string>;
    /**
     * List of [domain name status codes](https://www.icann.org/resources/pages/epp-status-codes-2014-06-16-en).
     */
    statusLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Details about the domain technical contact.
     */
    techContact?: pulumi.Input<inputs.route53domains.RegisteredDomainTechContact>;
    /**
     * Whether domain technical contact information is concealed from WHOIS queries. Default: `true`.
     */
    techPrivacy?: pulumi.Input<boolean>;
    /**
     * Whether the domain is locked for transfer. Default: `true`.
     */
    transferLock?: pulumi.Input<boolean>;
    /**
     * The last updated date of the domain as found in the response to a WHOIS query.
     */
    updatedDate?: pulumi.Input<string>;
    /**
     * The fully qualified name of the WHOIS server that can answer the WHOIS query for the domain.
     */
    whoisServer?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RegisteredDomain resource.
 */
export interface RegisteredDomainArgs {
    /**
     * Details about the domain administrative contact.
     */
    adminContact?: pulumi.Input<inputs.route53domains.RegisteredDomainAdminContact>;
    /**
     * Whether domain administrative contact information is concealed from WHOIS queries. Default: `true`.
     */
    adminPrivacy?: pulumi.Input<boolean>;
    /**
     * Whether the domain registration is set to renew automatically. Default: `true`.
     */
    autoRenew?: pulumi.Input<boolean>;
    /**
     * The name of the registered domain.
     */
    domainName: pulumi.Input<string>;
    /**
     * The list of nameservers for the domain.
     */
    nameServers?: pulumi.Input<pulumi.Input<inputs.route53domains.RegisteredDomainNameServer>[]>;
    /**
     * Details about the domain registrant.
     */
    registrantContact?: pulumi.Input<inputs.route53domains.RegisteredDomainRegistrantContact>;
    /**
     * Whether domain registrant contact information is concealed from WHOIS queries. Default: `true`.
     */
    registrantPrivacy?: pulumi.Input<boolean>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Details about the domain technical contact.
     */
    techContact?: pulumi.Input<inputs.route53domains.RegisteredDomainTechContact>;
    /**
     * Whether domain technical contact information is concealed from WHOIS queries. Default: `true`.
     */
    techPrivacy?: pulumi.Input<boolean>;
    /**
     * Whether the domain is locked for transfer. Default: `true`.
     */
    transferLock?: pulumi.Input<boolean>;
}