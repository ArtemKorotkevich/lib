package lib.com.antalogic.tender.entities.other.ftp.product;

import lib.com.antalogic.tender.entities.general.AbstractCustomer;
import lib.com.antalogic.tender.entities.other.ftp.FtpEntity;
import lombok.Data;
import org.hibernate.search.annotations.Field;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Okvd2 implements FtpEntity {
    @Id
    private long id;
    @Field
    @Column(columnDefinition="TEXT")
    private String code;
    @Column(columnDefinition="TEXT")
    private String section;
    @Column(columnDefinition="TEXT")
    private String name;
    @Column(columnDefinition="TEXT")
    private String comment;
    @Field
    private boolean actual;
    @ManyToMany
    private List<AbstractCustomer> customers;

    @Override
    public String getParentCode() {
        return null;
    }
}
