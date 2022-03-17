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

/** Eye Dropper */
object FA_EYE_DROPPER: Icon {
	
	override val name get() = "Eye Dropper"
	
	override val unicode get() = "f1fb"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M482.8 29.23C521.7 68.21 521.7 131.4 482.8 170.4L381.2 271.9L390.6 281.4C403.1 293.9 403.1 314.1 390.6 326.6C378.1 339.1 357.9 339.1 345.4 326.6L185.4 166.6C172.9 154.1 172.9 133.9 185.4 121.4C197.9 108.9 218.1 108.9 230.6 121.4L240.1 130.8L341.6 29.23C380.6-9.744 443.8-9.744 482.8 29.23L482.8 29.23zM55.43 323.3L176.1 202.6L221.4 247.9L100.7 368.6C97.69 371.6 96 375.6 96 379.9V416H132.1C136.4 416 140.4 414.3 143.4 411.3L264.1 290.6L309.4 335.9L188.7 456.6C173.7 471.6 153.3 480 132.1 480H89.69L49.75 506.6C37.06 515.1 20.16 513.4 9.373 502.6C-1.413 491.8-3.086 474.9 5.375 462.2L32 422.3V379.9C32 358.7 40.43 338.3 55.43 323.3L55.43 323.3z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_EYE_DROPPER]. */
val FA_EYEDROPPER = FA_EYE_DROPPER

/** Alias for [FA_EYE_DROPPER]. */
val FA_EYE_DROPPER_EMPTY = FA_EYE_DROPPER
