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

/** Tablet screen button */
object FA_TABLET_SCREEN_BUTTON: Icon {
	
	override val name get() = "Tablet screen button"
	
	override val unicode get() = "f3fa"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M384 .0001H64c-35.35 0-64 28.65-64 64v384c0 35.35 28.65 63.1 64 63.1h320c35.35 0 64-28.65 64-63.1v-384C448 28.65 419.3 .0001 384 .0001zM224 480c-17.75 0-32-14.25-32-32s14.25-32 32-32s32 14.25 32 32S241.8 480 224 480zM384 384H64v-320h320V384z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_TABLET_SCREEN_BUTTON]. */
val FA_TABLET_ALT = FA_TABLET_SCREEN_BUTTON
