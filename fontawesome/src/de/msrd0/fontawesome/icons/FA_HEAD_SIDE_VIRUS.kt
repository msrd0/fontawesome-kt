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

object FA_HEAD_SIDE_VIRUS: Icon {
	
	override val name get() = "Head Side Virus"
	
	override val unicode get() = "e064"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M208 175.1c-8.836 0-16 7.162-16 16c0 8.836 7.163 15.1 15.1 15.1s16-7.164 16-16C224 183.2 216.8 175.1 208 175.1zM272 239.1c-8.836 0-15.1 7.163-15.1 16c0 8.836 7.165 16 16 16s16-7.164 16-16C288 247.2 280.8 239.1 272 239.1zM509.2 275c-20.94-47.13-48.46-151.7-73.1-186.8C397.7 33.59 334.6 0 266.1 0H192C85.95 0 0 85.95 0 192c0 56.8 24.8 107.7 64 142.8L64 512h256l-.0044-64h63.99c35.34 0 63.1-28.65 63.1-63.1V320h31.98C503.1 320 518.6 296.2 509.2 275zM368 240h-12.12c-28.51 0-42.79 34.47-22.63 54.63l8.576 8.576c6.25 6.25 6.25 16.38 0 22.62c-3.125 3.125-7.219 4.688-11.31 4.688s-8.188-1.562-11.31-4.688l-8.576-8.576c-20.16-20.16-54.63-5.881-54.63 22.63V352c0 8.844-7.156 16-16 16s-16-7.156-16-16v-12.12c0-28.51-34.47-42.79-54.63-22.63l-8.576 8.576c-3.125 3.125-7.219 4.688-11.31 4.688c-4.096 0-8.188-1.562-11.31-4.688c-6.25-6.25-6.25-16.38 0-22.62l8.577-8.576C166.9 274.5 152.6 240 124.1 240H112c-8.844 0-16-7.156-16-16s7.157-16 16-16L124.1 208c28.51 0 42.79-34.47 22.63-54.63L138.2 144.8c-6.25-6.25-6.25-16.38 0-22.62s16.38-6.25 22.63 0L169.4 130.7c20.16 20.16 54.63 5.881 54.63-22.63V96c0-8.844 7.156-16 16-16S256 87.16 256 96v12.12c0 28.51 34.47 42.79 54.63 22.63l8.576-8.576c6.25-6.25 16.38-6.25 22.63 0s6.25 16.38 0 22.62L333.3 153.4C313.1 173.5 327.4 208 355.9 208l12.12-.0004c8.844 0 15.1 7.157 15.1 16S376.8 240 368 240z"/></svg>"""
		else -> null
	}
	
}
