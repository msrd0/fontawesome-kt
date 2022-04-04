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

/** Square rss */
object FA_SQUARE_RSS: Icon {
	
	override val name get() = "Square rss"
	
	override val unicode get() = "f143"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M384 32H64C28.65 32 0 60.66 0 96v320c0 35.34 28.65 64 64 64h320c35.35 0 64-28.66 64-64V96C448 60.66 419.3 32 384 32zM150.6 374.6C144.4 380.9 136.2 384 128 384s-16.38-3.121-22.63-9.371c-12.5-12.5-12.5-32.76 0-45.26C111.6 323.1 119.8 320 128 320s16.38 3.121 22.63 9.371C163.1 341.9 163.1 362.1 150.6 374.6zM249.6 383.9C249 383.1 248.5 384 247.1 384c-12.53 0-23.09-9.75-23.92-22.44C220.5 306.9 173.1 259.5 118.4 255.9c-13.22-.8438-23.25-12.28-22.39-25.5c.8594-13.25 12.41-22.81 25.52-22.38c77.86 5.062 145.3 72.5 150.4 150.4C272.8 371.7 262.8 383.1 249.6 383.9zM345 383.1C344.7 384 344.3 384 343.1 384c-12.8 0-23.42-10.09-23.97-23C315.6 254.6 225.4 164.4 119 159.1C105.8 159.4 95.47 148.3 96.02 135C96.58 121.8 107.9 111.2 121 112c130.7 5.469 241.5 116.3 246.1 246.1C368.5 372.3 358.3 383.4 345 383.1z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_SQUARE_RSS]. */
val FA_RSS_SQUARE = FA_SQUARE_RSS