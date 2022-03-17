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

/** Text slash */
object FA_TEXT_SLASH: Icon {
	
	override val name get() = "Text slash"
	
	override val unicode get() = "f87d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M352 416H306.7l18.96-64.1L271.4 308.5L239.1 416H192c-17.67 0-32 14.31-32 32s14.33 31.99 31.1 31.99h160C369.7 480 384 465.7 384 448S369.7 416 352 416zM630.8 469.1l-276.4-216.7l45.63-156.5H512v32c0 17.69 14.33 32 32 32s32-14.31 32-32v-64c0-17.69-14.33-32-32-32H192c-17.67 0-32 14.31-32 32v36.11L38.81 5.13c-10.47-8.219-25.53-6.37-33.7 4.068s-6.349 25.54 4.073 33.69l591.1 463.1c4.406 3.469 9.61 5.127 14.8 5.127c7.125 0 14.17-3.164 18.9-9.195C643.1 492.4 641.2 477.3 630.8 469.1zM300.1 209.9l-82.08-64.33C221.5 140.5 224 134.7 224 128v-32h109.3L300.1 209.9z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_TEXT_SLASH]. */
val FA_REMOVE_FORMAT = FA_TEXT_SLASH
