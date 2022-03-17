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

/** Vial Circle-check */
object FA_VIAL_CIRCLE_CHECK: Icon {
	
	override val name get() = "Vial Circle-check"
	
	override val unicode get() = "e596"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M0 64C0 46.33 14.33 32 32 32H224C241.7 32 256 46.33 256 64C256 81.67 241.7 96 224 96V266.8C203.8 295.4 192 330.3 192 368C192 393.2 197.3 417.1 206.8 438.8C189.5 463.7 160.6 480 128 480C74.98 480 32 437 32 384V96C14.33 96 0 81.67 0 64V64zM96 192H160V96H96V192zM512 368C512 447.5 447.5 512 368 512C288.5 512 224 447.5 224 368C224 288.5 288.5 224 368 224C447.5 224 512 288.5 512 368zM412.7 324.7L352 385.4L323.3 356.7C317.1 350.4 306.9 350.4 300.7 356.7C294.4 362.9 294.4 373.1 300.7 379.3L340.7 419.3C346.9 425.6 357.1 425.6 363.3 419.3L435.3 347.3C441.6 341.1 441.6 330.9 435.3 324.7C429.1 318.4 418.9 318.4 412.7 324.7H412.7z"/></svg>"""
		else -> null
	}
	
}
