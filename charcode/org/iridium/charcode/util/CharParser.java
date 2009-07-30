/**
 * 
 */
package org.iridium.charcode.util;

import java.io.UnsupportedEncodingException;

/**
 * @author caoyi
 * 
 */
public class CharParser {
	/**
	 * 
	 * @param str
	 *            �������ִ�
	 * @param charSet
	 *            �ƶ��ı��뷽��, Ŀǰ�� UTF-8, UTF-16, BIG5, GB2312 �²��Թ�, ��GB2312�ı����
	 *            Unicode ��վ�ı��벻ͬ, UTF-16 �ƺ��ж��������, ���о�.
	 * @return �ִ������ƶ����������16�������
	 * @throws UnsupportedEncodingException
	 */
	public static String decode(String str, String charSet)
			throws UnsupportedEncodingException {
		StringBuffer sb = new StringBuffer();
		byte[] array = str.getBytes(charSet);
		for (byte c : array) {
			sb.append(Integer.toHexString(c & 0xFF));
		}
		return sb.toString();
	}
}
