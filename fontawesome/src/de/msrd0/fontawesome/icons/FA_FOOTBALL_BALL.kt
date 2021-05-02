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

object FA_FOOTBALL_BALL: Icon {
	
	override val name get() = "Football Ball"
	
	override val unicode get() = "f44e"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 496 512"><path d="M481.5 60.3c-4.8-18.2-19.1-32.5-37.3-37.4C420.3 16.5 383 8.9 339.4 8L496 164.8c-.8-43.5-8.2-80.6-14.5-104.5zm-467 391.4c4.8 18.2 19.1 32.5 37.3 37.4 23.9 6.4 61.2 14 104.8 14.9L0 347.2c.8 43.5 8.2 80.6 14.5 104.5zM4.2 283.4L220.4 500c132.5-19.4 248.8-118.7 271.5-271.4L275.6 12C143.1 31.4 26.8 130.7 4.2 283.4zm317.3-123.6c3.1-3.1 8.2-3.1 11.3 0l11.3 11.3c3.1 3.1 3.1 8.2 0 11.3l-28.3 28.3 28.3 28.3c3.1 3.1 3.1 8.2 0 11.3l-11.3 11.3c-3.1 3.1-8.2 3.1-11.3 0l-28.3-28.3-22.6 22.7 28.3 28.3c3.1 3.1 3.1 8.2 0 11.3l-11.3 11.3c-3.1 3.1-8.2 3.1-11.3 0L248 278.6l-22.6 22.6 28.3 28.3c3.1 3.1 3.1 8.2 0 11.3l-11.3 11.3c-3.1 3.1-8.2 3.1-11.3 0l-28.3-28.3-28.3 28.3c-3.1 3.1-8.2 3.1-11.3 0l-11.3-11.3c-3.1-3.1-3.1-8.2 0-11.3l28.3-28.3-28.3-28.2c-3.1-3.1-3.1-8.2 0-11.3l11.3-11.3c3.1-3.1 8.2-3.1 11.3 0l28.3 28.3 22.6-22.6-28.3-28.3c-3.1-3.1-3.1-8.2 0-11.3l11.3-11.3c3.1-3.1 8.2-3.1 11.3 0l28.3 28.3 22.6-22.6-28.3-28.3c-3.1-3.1-3.1-8.2 0-11.3l11.3-11.3c3.1-3.1 8.2-3.1 11.3 0l28.3 28.3 28.3-28.5z"/></svg>"""
		else -> null
	}
	
}
