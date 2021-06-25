// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./app";
export * from "./backendEnvironment";
export * from "./branch";
export * from "./domainAssociation";
export * from "./webhook";

// Import resources to register:
import { App } from "./app";
import { BackendEnvironment } from "./backendEnvironment";
import { Branch } from "./branch";
import { DomainAssociation } from "./domainAssociation";
import { Webhook } from "./webhook";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:amplify/app:App":
                return new App(name, <any>undefined, { urn })
            case "aws:amplify/backendEnvironment:BackendEnvironment":
                return new BackendEnvironment(name, <any>undefined, { urn })
            case "aws:amplify/branch:Branch":
                return new Branch(name, <any>undefined, { urn })
            case "aws:amplify/domainAssociation:DomainAssociation":
                return new DomainAssociation(name, <any>undefined, { urn })
            case "aws:amplify/webhook:Webhook":
                return new Webhook(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "amplify/app", _module)
pulumi.runtime.registerResourceModule("aws", "amplify/backendEnvironment", _module)
pulumi.runtime.registerResourceModule("aws", "amplify/branch", _module)
pulumi.runtime.registerResourceModule("aws", "amplify/domainAssociation", _module)
pulumi.runtime.registerResourceModule("aws", "amplify/webhook", _module)