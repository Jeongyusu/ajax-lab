package shop.mtcoding.ajax.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor // DB 조회 -> PC에 Category 객체 생성 -> 빈생성자를 호출
@Setter
@Getter
@Table(name = "tech_tb")
@Entity
public class Tech {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    private String name; // Spring, Java, Javascript, React, HTML

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

}
