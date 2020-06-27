module com.sda.userdao {
    requires com.sda.dao;
    requires com.sda.entity;
    provides com.sda.dao.Dao with com.sda.userdao.UserDao;
    exports com.sda.userdao;
}