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

object FA_SNOWBOARDING: Icon {
	
	override val name get() = "Snowboarding"
	
	override val unicode get() = "f7ce"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M432 96c26.5 0 48-21.5 48-48S458.5 0 432 0s-48 21.5-48 48 21.5 48 48 48zm28.8 153.6c5.8 4.3 12.5 6.4 19.2 6.4 9.7 0 19.3-4.4 25.6-12.8 10.6-14.1 7.8-34.2-6.4-44.8l-111.4-83.5c-13.8-10.3-29.1-18.4-45.4-23.8l-63.7-21.2-26.1-52.1C244.7 2 225.5-4.4 209.7 3.5c-15.8 7.9-22.2 27.1-14.3 42.9l29.1 58.1c5.7 11.4 15.6 19.9 27.7 24l16.4 5.5-41.2 20.6c-21.8 10.9-35.4 32.8-35.4 57.2v53.1l-74.1 24.7c-16.8 5.6-25.8 23.7-20.2 40.5 1.7 5.2 4.9 9.4 8.7 12.9l-38.7-14.1c-9.7-3.5-17.4-10.6-21.8-20-5.6-12-19.9-17.2-31.9-11.6s-17.2 19.9-11.6 31.9c9.8 21 27.1 36.9 48.9 44.8l364.8 132.7c9.7 3.5 19.7 5.3 29.7 5.3 12.5 0 24.9-2.7 36.5-8.2 12-5.6 17.2-19.9 11.6-31.9S474 454.7 462 460.3c-9.3 4.4-19.8 4.8-29.5 1.3l-90.8-33.1c8.7-4.1 15.6-11.8 17.8-21.9l21.9-102c3.9-18.2-3.2-37.2-18.1-48.4l-52-39 66-30.5 83.5 62.9zm-144.4 51.7l-19.7 92c-1.5 7.1-.1 13.9 2.8 20l-169.4-61.6c2.7-.2 5.4-.4 8-1.3l85-28.4c19.6-6.5 32.8-24.8 32.8-45.5V256l60.5 45.3z"/></svg>"""
		else -> null
	}
	
}
