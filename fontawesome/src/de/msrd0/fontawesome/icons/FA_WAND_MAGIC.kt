/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

/** Wand magic */
object FA_WAND_MAGIC: Icon {
	
	override val name get() = "Wand magic"
	
	override val unicode get() = "f0d0"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M14.06 463.3C-4.686 444.6-4.686 414.2 14.06 395.4L395.4 14.06C414.2-4.686 444.6-4.686 463.3 14.06L497.9 48.64C516.6 67.38 516.6 97.78 497.9 116.5L116.5 497.9C97.78 516.6 67.38 516.6 48.64 497.9L14.06 463.3zM347.6 187.6L452.6 82.58L429.4 59.31L324.3 164.3L347.6 187.6z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_WAND_MAGIC]. */
val FA_MAGIC = FA_WAND_MAGIC
