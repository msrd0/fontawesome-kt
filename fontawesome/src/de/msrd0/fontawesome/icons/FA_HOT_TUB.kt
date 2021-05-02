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

object FA_HOT_TUB: Icon {
	
	override val name get() = "Hot Tub"
	
	override val unicode get() = "f593"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M414.21 177.65c1.02 8.21 7.75 14.35 15.75 14.35h16.12c9.51 0 17.08-8.57 16-18.35-4.34-39.11-22.4-74.53-50.13-97.16-17.37-14.17-28.82-36.75-31.98-62.15C378.96 6.14 372.22 0 364.23 0h-16.12c-9.51 0-17.09 8.57-16 18.35 4.34 39.11 22.4 74.53 50.13 97.16 17.36 14.17 28.82 36.75 31.97 62.14zm-108 0c1.02 8.21 7.75 14.35 15.75 14.35h16.12c9.51 0 17.08-8.57 16-18.35-4.34-39.11-22.4-74.53-50.13-97.16-17.37-14.17-28.82-36.75-31.98-62.15C270.96 6.14 264.22 0 256.23 0h-16.12c-9.51 0-17.09 8.57-16 18.35 4.34 39.11 22.4 74.53 50.13 97.16 17.36 14.17 28.82 36.75 31.97 62.14zM480 256H256l-110.93-83.2a63.99 63.99 0 0 0-38.4-12.8H64c-35.35 0-64 28.65-64 64v224c0 35.35 28.65 64 64 64h384c35.35 0 64-28.65 64-64V288c0-17.67-14.33-32-32-32zM128 440c0 4.42-3.58 8-8 8h-16c-4.42 0-8-3.58-8-8V328c0-4.42 3.58-8 8-8h16c4.42 0 8 3.58 8 8v112zm96 0c0 4.42-3.58 8-8 8h-16c-4.42 0-8-3.58-8-8V328c0-4.42 3.58-8 8-8h16c4.42 0 8 3.58 8 8v112zm96 0c0 4.42-3.58 8-8 8h-16c-4.42 0-8-3.58-8-8V328c0-4.42 3.58-8 8-8h16c4.42 0 8 3.58 8 8v112zm96 0c0 4.42-3.58 8-8 8h-16c-4.42 0-8-3.58-8-8V328c0-4.42 3.58-8 8-8h16c4.42 0 8 3.58 8 8v112zM64 128c35.35 0 64-28.65 64-64S99.35 0 64 0 0 28.65 0 64s28.65 64 64 64z"/></svg>"""
		else -> null
	}
	
}
