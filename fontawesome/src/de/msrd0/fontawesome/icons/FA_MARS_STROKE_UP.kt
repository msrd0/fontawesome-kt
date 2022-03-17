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

object FA_MARS_STROKE_UP: Icon {
	
	override val name get() = "Mars stroke up"
	
	override val unicode get() = "f22a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M224 163V144h24c4.418 0 8-3.578 8-7.1V120c0-4.418-3.582-7.1-8-7.1H224V96h24.63c16.41 0 24.62-19.84 13.02-31.44l-60.97-60.97c-4.795-4.793-12.57-4.793-17.36 0L122.3 64.56c-11.6 11.6-3.383 31.44 13.02 31.44H160v15.1H136c-4.418 0-8 3.582-8 7.1v15.1c0 4.422 3.582 7.1 8 7.1H160v19.05c-84.9 15.62-148.5 92.01-143.7 182.5c4.783 90.69 82.34 165.1 173.2 166.5C287.8 513.4 368 434.1 368 336C368 249.7 305.9 178.1 224 163zM192 431.1c-52.94 0-96-43.06-96-95.1s43.06-95.1 96-95.1c52.93 0 96 43.06 96 95.1S244.9 431.1 192 431.1z"/></svg>"""
		else -> null
	}
	
}

val FA_MARS_STROKE_V = FA_MARS_STROKE_UP
