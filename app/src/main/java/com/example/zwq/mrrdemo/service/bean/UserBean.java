package com.example.zwq.mrrdemo.service.bean;

/**
 * @ClassName :    com.example.zwq.mrrdemo.service.bean
 * @Describe :     用户登录成功后返回的用户信息实体类
 * @Author :       ZWQ
 * @Time :       2017/4/5 16:21
 */

public class UserBean {

    private String code;
    private DataBean data;
    private String message;
    private String status;
    private String version;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public static class DataBean {

        private String formhash;
        private MemberBean member;

        public String getFormhash() {
            return formhash;
        }

        public void setFormhash(String formhash) {
            this.formhash = formhash;
        }

        public MemberBean getMember() {
            return member;
        }

        public void setMember(MemberBean member) {
            this.member = member;
        }

        public static class MemberBean {

            private String adminid;
            private String attent_count;
            private String avatar;
            private String be_attent_count;
            private String credit;
            private String diaobi;
            private HuanxinBean huanxin;
            private String mobile;
            private String new_attent_count;
            private String next_level_credit;
            private String next_level_precent;
            private String notify_count;
            private String pre_level_credit;
            private String qq;
            private String qq_bind;
            private String residecity;
            private String sex;
            private String thread_count;
            private String token;
            private String uid;
            private String user_level;
            private String username;
            private String wechat_bind;

            public String getAdminid() {
                return adminid;
            }

            public void setAdminid(String adminid) {
                this.adminid = adminid;
            }

            public String getAttent_count() {
                return attent_count;
            }

            public void setAttent_count(String attent_count) {
                this.attent_count = attent_count;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getBe_attent_count() {
                return be_attent_count;
            }

            public void setBe_attent_count(String be_attent_count) {
                this.be_attent_count = be_attent_count;
            }

            public String getCredit() {
                return credit;
            }

            public void setCredit(String credit) {
                this.credit = credit;
            }

            public String getDiaobi() {
                return diaobi;
            }

            public void setDiaobi(String diaobi) {
                this.diaobi = diaobi;
            }

            public HuanxinBean getHuanxin() {
                return huanxin;
            }

            public void setHuanxin(HuanxinBean huanxin) {
                this.huanxin = huanxin;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getNew_attent_count() {
                return new_attent_count;
            }

            public void setNew_attent_count(String new_attent_count) {
                this.new_attent_count = new_attent_count;
            }

            public String getNext_level_credit() {
                return next_level_credit;
            }

            public void setNext_level_credit(String next_level_credit) {
                this.next_level_credit = next_level_credit;
            }

            public String getNext_level_precent() {
                return next_level_precent;
            }

            public void setNext_level_precent(String next_level_precent) {
                this.next_level_precent = next_level_precent;
            }

            public String getNotify_count() {
                return notify_count;
            }

            public void setNotify_count(String notify_count) {
                this.notify_count = notify_count;
            }

            public String getPre_level_credit() {
                return pre_level_credit;
            }

            public void setPre_level_credit(String pre_level_credit) {
                this.pre_level_credit = pre_level_credit;
            }

            public String getQq() {
                return qq;
            }

            public void setQq(String qq) {
                this.qq = qq;
            }

            public String getQq_bind() {
                return qq_bind;
            }

            public void setQq_bind(String qq_bind) {
                this.qq_bind = qq_bind;
            }

            public String getResidecity() {
                return residecity;
            }

            public void setResidecity(String residecity) {
                this.residecity = residecity;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }

            public String getThread_count() {
                return thread_count;
            }

            public void setThread_count(String thread_count) {
                this.thread_count = thread_count;
            }

            public String getToken() {
                return token;
            }

            public void setToken(String token) {
                this.token = token;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getUser_level() {
                return user_level;
            }

            public void setUser_level(String user_level) {
                this.user_level = user_level;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getWechat_bind() {
                return wechat_bind;
            }

            public void setWechat_bind(String wechat_bind) {
                this.wechat_bind = wechat_bind;
            }

            public static class HuanxinBean {

                private String password;
                private String username;

                public String getPassword() {
                    return password;
                }

                public void setPassword(String password) {
                    this.password = password;
                }

                public String getUsername() {
                    return username;
                }

                public void setUsername(String username) {
                    this.username = username;
                }
            }

            @Override
            public String toString() {
                return "MemberBean{" +
                        "adminid='" + adminid + '\'' +
                        ", attent_count='" + attent_count + '\'' +
                        ", avatar='" + avatar + '\'' +
                        ", be_attent_count='" + be_attent_count + '\'' +
                        ", credit='" + credit + '\'' +
                        ", diaobi='" + diaobi + '\'' +
                        ", huanxin=" + huanxin +
                        ", mobile='" + mobile + '\'' +
                        ", new_attent_count='" + new_attent_count + '\'' +
                        ", next_level_credit='" + next_level_credit + '\'' +
                        ", next_level_precent='" + next_level_precent + '\'' +
                        ", notify_count='" + notify_count + '\'' +
                        ", pre_level_credit='" + pre_level_credit + '\'' +
                        ", qq='" + qq + '\'' +
                        ", qq_bind='" + qq_bind + '\'' +
                        ", residecity='" + residecity + '\'' +
                        ", sex='" + sex + '\'' +
                        ", thread_count='" + thread_count + '\'' +
                        ", token='" + token + '\'' +
                        ", uid='" + uid + '\'' +
                        ", user_level='" + user_level + '\'' +
                        ", username='" + username + '\'' +
                        ", wechat_bind='" + wechat_bind + '\'' +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "formhash='" + formhash + '\'' +
                    ", member=" + member +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "code='" + code + '\'' +
                ", data=" + data +
                ", message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
