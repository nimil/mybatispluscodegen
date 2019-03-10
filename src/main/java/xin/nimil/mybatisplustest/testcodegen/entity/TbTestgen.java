package xin.nimil.mybatisplustest.testcodegen.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author nimil
 * @since 2019-03-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TbTestgen implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String testgen;


}
