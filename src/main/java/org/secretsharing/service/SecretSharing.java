package org.secretsharing.service;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import org.secretsharing.model.SecretShareDTO;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SecretSharing {

    Flux<SecretShareDTO> splitSecret(int k, int n, String secret)
            throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, IllegalArgumentException;

    Mono<String> recoverSecret(Flux<SecretShareDTO> shares) throws NoSuchAlgorithmException, SignatureException,
            InvalidKeyException, SecurityException, IllegalArgumentException;

}
