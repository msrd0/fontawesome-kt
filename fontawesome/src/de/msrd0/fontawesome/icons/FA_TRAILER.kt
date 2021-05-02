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

object FA_TRAILER: Icon {
	
	override val name get() = "Trailer"
	
	override val unicode get() = "e041"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M624,320H544V80a16,16,0,0,0-16-16H16A16,16,0,0,0,0,80V368a16,16,0,0,0,16,16H65.61c7.83-54.21,54-96,110.39-96s102.56,41.79,110.39,96H624a16,16,0,0,0,16-16V336A16,16,0,0,0,624,320ZM96,243.68a176.29,176.29,0,0,0-32,20.71V136a8,8,0,0,1,8-8H88a8,8,0,0,1,8,8Zm96-18.54c-5.31-.49-10.57-1.14-16-1.14s-10.69.65-16,1.14V136a8,8,0,0,1,8-8h16a8,8,0,0,1,8,8Zm96,39.25a176.29,176.29,0,0,0-32-20.71V136a8,8,0,0,1,8-8h16a8,8,0,0,1,8,8ZM384,320H352V136a8,8,0,0,1,8-8h16a8,8,0,0,1,8,8Zm96,0H448V136a8,8,0,0,1,8-8h16a8,8,0,0,1,8,8Zm-304,0a80,80,0,1,0,80,80A80,80,0,0,0,176,320Zm0,112a32,32,0,1,1,32-32A32,32,0,0,1,176,432Z"/></svg>"""
		else -> null
	}
	
}
