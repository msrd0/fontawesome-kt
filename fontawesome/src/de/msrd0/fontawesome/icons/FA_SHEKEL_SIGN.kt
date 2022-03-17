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

/** Shekel Sign */
object FA_SHEKEL_SIGN: Icon {
	
	override val name get() = "Shekel Sign"
	
	override val unicode get() = "f20b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M192 32C262.7 32 320 89.31 320 160V320C320 337.7 305.7 352 288 352C270.3 352 256 337.7 256 320V160C256 124.7 227.3 96 192 96H64V448C64 465.7 49.67 480 32 480C14.33 480 0 465.7 0 448V64C0 46.33 14.33 32 32 32H192zM160 480C142.3 480 128 465.7 128 448V192C128 174.3 142.3 160 160 160C177.7 160 192 174.3 192 192V416H320C355.3 416 384 387.3 384 352V64C384 46.33 398.3 32 416 32C433.7 32 448 46.33 448 64V352C448 422.7 390.7 480 320 480H160z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_SHEKEL_SIGN]. */
val FA_ILS = FA_SHEKEL_SIGN

/** Alias for [FA_SHEKEL_SIGN]. */
val FA_SHEKEL = FA_SHEKEL_SIGN

/** Alias for [FA_SHEKEL_SIGN]. */
val FA_SHEQEL = FA_SHEKEL_SIGN

/** Alias for [FA_SHEKEL_SIGN]. */
val FA_SHEQEL_SIGN = FA_SHEKEL_SIGN
