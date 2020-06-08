package lib.com.antalogic.tender.entities.other.ftp.product;

import lib.com.antalogic.tender.entities.other.ftp.FtpEntity;
import lombok.Data;
import org.hibernate.search.annotations.Field;

import javax.persistence.*;

@Entity
@Data
public class Okpd2 implements FtpEntity {
    @Id
    private Long id;
    private long parentId;
    @Field
    @Column(columnDefinition="TEXT")
    private String code;
    @Column(columnDefinition="TEXT")
    private String parentCode;
    @Field
    @Column(columnDefinition="TEXT")
    private String name;
    private boolean actual;
//    @ManyToMany
//    private List<Okvd2> okvd2List;
}
