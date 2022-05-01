package com.indian11.app.PaytmPackage.crypto;

/**
 * Created by Sameer Jani on 29/1/18.
 */
public class EncryptionFactory {
    private EncryptionFactory() {
    }

    public static com.indian11.app.PaytmPackage.crypto.Encryption getEncryptionInstance(String algorithmType) {
        return new AesEncryption();
    }

    public static com.indian11.app.PaytmPackage.crypto.EncryptionGAE getEncryptionInstanceGAE(String algorithmType) {
        return new AesEncryptionGAE();
    }

    public static com.indian11.app.PaytmPackage.crypto.EncryptionIBMJCE getEncryptionInstanceIBMJCE(String algorithmType) {
        return new AesEncryptionIBMJCE();
    }
}
