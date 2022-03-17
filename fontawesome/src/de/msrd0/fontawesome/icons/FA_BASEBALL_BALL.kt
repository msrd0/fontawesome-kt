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

object FA_BASEBALL_BALL: Icon {
	
	override val name get() = "Baseball Ball"
	
	override val unicode get() = "f433"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M429.6 272.9c0-16.26 16.36-16.81 29.99-16.81l2.931 .0029c16.64 0 33.14 2.056 49.2 5.834C511.7 259.9 512 258 512 256c0-141.4-114.6-256-256-256C253.9 0 251.1 .2578 249.9 .3047c3.658 15.51 6.111 31.34 6.111 47.54c0 6-.2813 12.03-.7813 18C254.6 74.19 247.6 80.5 239.3 80.5c-6.091 0-16.03-4.68-16.03-15.97c0-1.733 .7149-7.153 .7149-16.69c0-15.26-2.389-30.18-6.225-44.69C106.9 19.79 19.5 107.3 3.08 218.3c14.44 3.819 29.38 5.79 44.45 5.79c10.07 0 15.59-.811 17.42-.811c6.229 0 16.49 4.657 16.49 15.99c0 16.11-16.13 16.77-29.73 16.77L48.16 256c-16.33 0-32.25-2.445-47.85-6.109C.2578 251.1 0 253.9 0 256c0 141.4 114.6 256 256 256c2.066 0 4.062-.2578 6.117-.3086C258.5 496.2 256 480.4 256 464.2c0-5.688 .25-11.38 .7187-17.03c.6964-8.538 8.287-14.61 16.49-14.61c7.1 0 15.44 6.938 15.44 15.92c0 2.358-.6524 5.88-.6524 15.72c0 15.25 2.383 30.16 6.209 44.66c110.8-16.63 198.2-104.1 214.7-215c-14.55-3.851-29.59-5.871-44.74-5.871c-10.47 0-16.24 .895-18.13 .895C443.3 288.9 429.6 286.5 429.6 272.9zM238.2 128.9c0 27.78-78.3 108.1-108.6 108.1c-8.612 0-16.01-6.963-16.01-15.98c0-6.002 3.394-11.75 9.163-14.49c80.3-38.08 76.21-94.5 99.39-94.5C234.7 112.8 238.2 124.2 238.2 128.9zM397.5 290.6c0 5.965-3.364 11.68-9.131 14.43c-78.82 37.57-75.92 95-98.94 95c-12.58 0-16.01-11.54-16.01-16.03c0-28 78.29-109.4 108.1-109.4C390.8 274.6 397.5 282.3 397.5 290.6z"/></svg>"""
		else -> null
	}
	
}

val FA_BASEBALL_BALL = FA_BASEBALL_BALL
