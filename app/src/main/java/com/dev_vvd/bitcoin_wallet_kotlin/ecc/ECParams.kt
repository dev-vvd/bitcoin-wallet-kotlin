package com.dev_vvd.mnemonic_gen_android.ecc

import java.math.BigInteger
import java.security.spec.ECParameterSpec
import java.security.spec.ECPoint
import java.security.spec.EllipticCurve

class ECParams(curve: EllipticCurve?, g: ECPoint?, n: BigInteger?, h: Int) :
    ECParameterSpec(curve, g, n, h) {

    override fun getCurve(): EllipticCurve {
        return super.getCurve()
    }

    override fun getGenerator(): ECPoint {
        return super.getGenerator()
    }

    override fun getOrder(): BigInteger {
        return super.getOrder()
    }

    override fun getCofactor(): Int {
        return super.getCofactor()
    }

}