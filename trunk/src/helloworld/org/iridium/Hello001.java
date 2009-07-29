package org.iridium;

/**
 * "��"�ֵı��������
 * http://bit.ly/xLVAv
 * �鵽.
 * 
 * Ϊ�λ���ֶ��������?
 * http://bit.ly/kOmu9
 * 
 */
import java.io.UnsupportedEncodingException;

public class Hello001 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		Hello001.decode("��", "UTF-8");
		Hello001.decode("��", "UTF-16");
		Hello001.decode("��", "BIG5");
		Hello001.decode("��", "GB2312");
	}

	public static void decode(String str, String charSet)
			throws UnsupportedEncodingException {
		byte[] array = str.getBytes(charSet);
		System.out.println("CharSet: " + charSet);
		System.out.println("length: " + array.length);
		System.out.println("values: ");
		for (byte c : array) {
			System.out.println(Integer.toHexString(c & 0xFF) );
		}
	}

}
