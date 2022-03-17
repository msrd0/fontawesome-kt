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

/** Person Pregnant */
object FA_PERSON_PREGNANT: Icon {
	
	override val name get() = "Person Pregnant"
	
	override val unicode get() = "e31e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M112 48C112 21.49 133.5 0 160 0C186.5 0 208 21.49 208 48C208 74.51 186.5 96 160 96C133.5 96 112 74.51 112 48zM88 382.1C74.2 379.4 64 366.9 64 352V296.9L59.43 304.5C50.33 319.6 30.67 324.5 15.52 315.4C.3696 306.3-4.531 286.7 4.573 271.5L62.85 174.6C77.84 149.6 103.2 133 131.5 128.1C135.6 128.3 139.8 128 144 128H160C161.4 128 162.8 128.1 164.1 128.3C199.8 131.2 229.5 157.6 236.2 193.3L242.3 225.7C286.6 234.3 320 273.2 320 320V352C320 369.7 305.7 384 288 384H232V480C232 497.7 217.7 512 200 512C182.3 512 168 497.7 168 480V384H152V480C152 497.7 137.7 512 120 512C102.3 512 88 497.7 88 480L88 382.1z"/></svg>"""
		else -> null
	}
	
}
