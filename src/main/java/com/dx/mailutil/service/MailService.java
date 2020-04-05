package com.dx.mailutil.service;

public interface MailService {
    /**
     * 发送邮件
     * @param to 收件人
     * @param sub 主题
     * @param cont 内容
     */
    void sendMail(String to, String sub, String cont);
}
