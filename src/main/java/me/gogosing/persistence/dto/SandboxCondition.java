package me.gogosing.persistence.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.gogosing.persistence.code.SandboxCategory;
import me.gogosing.support.dto.filter.FilterNumericRange;

/**
 * 데이터 필터.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class SandboxCondition {

	/**
	 * 이름.
	 */
	@Schema(description = "이름")
	private String name;

	/**
	 * 나이.
	 */
	@Schema(description = "나이 범위")
	private FilterNumericRange age;

	/**
	 * 유형.
	 */
	@NotNull
	@Schema(description = "카테고리")
	private SandboxCategory category;
}
