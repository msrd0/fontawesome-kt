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

/** Person dress */
object FA_PERSON_DRESS: Icon {
	
	override val name get() = "Person dress"
	
	override val unicode get() = "f182"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M112 48C112 21.49 133.5 0 160 0C186.5 0 208 21.49 208 48C208 74.51 186.5 96 160 96C133.5 96 112 74.51 112 48zM88 384H70.2C59.28 384 51.57 373.3 55.02 362.9L93.28 248.1L59.43 304.5C50.33 319.6 30.67 324.5 15.52 315.4C.3696 306.3-4.531 286.7 4.573 271.5L58.18 182.3C78.43 148.6 114.9 128 154.2 128H165.8C205.1 128 241.6 148.6 261.8 182.3L315.4 271.5C324.5 286.7 319.6 306.3 304.5 315.4C289.3 324.5 269.7 319.6 260.6 304.5L226.7 248.1L264.1 362.9C268.4 373.3 260.7 384 249.8 384H232V480C232 497.7 217.7 512 200 512C182.3 512 168 497.7 168 480V384H152V480C152 497.7 137.7 512 120 512C102.3 512 88 497.7 88 480L88 384z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_PERSON_DRESS]. */
val FA_FEMALE = FA_PERSON_DRESS
