package com.sihai.utils;

public class AlipayConfig {

	public static String app_id = "2016102400752740";//??????????????????
	
	public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCVQpgRT9/QtohoED4IgS1vHSZDTM6u/OWEcwHHHbkRKhPIysI/ieA7oat1ySHnwT13xvZjo8Qs01BIDbUnq/yu39nlgoYQi8rei7wJYOyP0hP34Z2HKMWvdp8N6FbumGmHV39pEcKiGAxziJjU3v8uJINAUTz8c1++8OHAbFHl+HQs5t3lgKhVVN2+3bUJHbu10j4OfsrZvOGFUY5VkrPevULpMEq4YKFZRwTut1QMPQBFaOA2jUFlzRhb4o6F2csle04610yI7KVoEZ7wQPUOLTtfUmBsWULq/1fHIjsyC7QbOQUpUT9eGvtIRoywH62yX+hgdLruQ1oJfTX10j4FAgMBAAECggEABX7fNHv5ZKjj2tkGP6/p6VZsazvvvDeph7foT9mDT+N5uQHmJwq/i9KHCp4uNmdCCR/1QHPuLCxXn1+J1P0bH6E0V6P3pbJP9OO2N64u55i3jX/sGebhaHV4o71zPfO0pvwMv+ScgvVZuANGhUf0o1FK19pl4XGqC9C4ryoN1ebChVjpquii74Wrt4Mw5ois5xSK0fzngIktqSPqspBVAsiMYipmCq/ZRhCWmcfbQ89l6SZ4MdHUQiZ4Inl7iKw0qtsKQ9avD5y5fd4MVnXOZBVTevN9CHHR28OG1YlPlEyqDcebmiYw6cp9TIL3Tiut5G+PuAXdiHdxRMLtX577YQKBgQDVOLOIc4LwVgxNGAE/V/PJ7i5shuT36SlFcVd+oBgiZeayqy4YMlGYTDFzSoHhYy6hmM4hpzxarh1AKj10I/VHgWN73A9OmFQX7xc4Q7njkNO3pTRdJhlU573yu/y8smfa4oJahdTve7adK6vcUBBYjRdaXswCSdapi/WVWS48HQKBgQCzNMO5MNF+sNEvqg2/qtfjluV//qpShZBMyyLsip1OMovAOeTk2vGm7NjQTXutC90REBQTuJVSgln8YJQFdz6oBicxOrciTEg63sTosFTnEId/qoZotJndFQm9MwWMVPcX3/NPiAearl0/+0NlCRDq1El+Piz1gP4QRRFtNIbVCQKBgQCpLEnV88BqK/uql2c1+PSmvOH8nbLBuC9Ut67x+tfrQuqdzA/QhuwSaDG8BduzFlyDPpgeP3A1inwO0vTbV0RfLZvfRCSo+VePfdXwgFvW4Kv6w4sedQIYSZ5+HwVSOkMIejtu00y1jnS/k0zSinvNpnRm8VvwXOGCuFdr3cw/SQKBgFrycFJQAEH3onI6L3gSUDZkolxu9imjNzSB81twjZzd8ibAOvYaV4GLug0dBaMw3iSGsGnBx6Z0GQ8IRJbxiY7kcId/cOmrJQ0beXtN4gjSTrHv7P6+iUe2IZcviaVKiYxIT8cRFireStzpu65PB5Ll4dZ7331I1aeUJd/yRGthAoGAMA447kSLyZ+mnOmRT4FDVqg3ym96zGtiVIURvw34GYiKyYdNfwz7Ff9kPPV6LT1sUPmtYFO7uE3o//TKT6cU0BD14abl6T8F8MupjxCKIRUUPaEk+48CtdxPt0yRtQuWX+NaTsnmzSOdJH7wA5rA7VmRow7MBK5yCE77lWH22mg=";//?????????????????????

	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsrH0b2IX6CYd4tFD+Y2zYau13clNo6r1q4BYGf524HVpUTFX8tiBlKlZ4xTg5/pdDEBYvlUz/tvalYe2NeIMc0hwlSYIt/Bvl/5QC3bDYVjRIvrHEy9SA7N9PxWca3bHTFBzLIgRKHhRY3Yu1OGnPs+MP+zWahcNxAqdL5TgMZpMEiP563kdrMfYDt9pDw80/LOjtszGiuB1vJ/EGF+bk/F/k7QZjy9mxprgBCc+rATike+9198KRaVNUeCyU5XBvsEbX36D4dygZIRW4RnLP49njvz4KlwmrsgpECm/xBPnln6UGBMofjdav1KREzWgappPC3VhvgLnvNQoCgPg8wIDAQAB";//?????????????????????
	
	public static String notify_url = "http://113.57.172.27:10086/alipay/alipayNotifyNotice";
	
	public static String return_url = "http://113.57.172.27:10086/alipay/alipayReturnNotice";
	
	public static String sign_type = "RSA2";
	
	public static String charset = "utf-8";
	
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";//????????????????????????https://openapi.alipay.com/gateway.do
}
