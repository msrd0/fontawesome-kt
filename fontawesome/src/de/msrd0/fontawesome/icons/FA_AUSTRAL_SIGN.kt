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

/** Austral Sign */
object FA_AUSTRAL_SIGN: Icon {
	
	override val name get() = "Austral Sign"
	
	override val unicode get() = "e0a9"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M325.3 224H416C433.7 224 448 238.3 448 256C448 273.7 433.7 288 416 288H352L365.3 320H416C433.7 320 448 334.3 448 352C448 369.7 433.7 384 416 384H392L413.5 435.7C420.3 452 412.6 470.7 396.3 477.5C379.1 484.3 361.3 476.6 354.5 460.3L322.7 384H125.3L93.54 460.3C86.74 476.6 68.01 484.3 51.69 477.5C35.38 470.7 27.66 452 34.46 435.7L56 384H32C14.33 384 0 369.7 0 352C0 334.3 14.33 320 32 320H82.67L96 288H32C14.33 288 0 273.7 0 256C0 238.3 14.33 224 32 224H122.7L194.5 51.69C199.4 39.77 211.1 32 224 32C236.9 32 248.6 39.77 253.5 51.69L325.3 224zM256 224L223.1 147.2L191.1 224H256zM165.3 288L151.1 320H296L282.7 288H165.3z"/></svg>"""
		else -> null
	}
	
}
